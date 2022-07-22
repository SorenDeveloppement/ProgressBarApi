package fr.galaglow.pbar;

import fr.galaglow.pbar.utils.ProgressBarType;

import java.util.Collections;

public class ProgressBar {

    private ProgressBarType pBType;
    private Integer maxValue;
    private Integer actualValue = 0;

    private Integer percent;

    public static class InitializeProgressBar {
        private ProgressBarType pBType;
        private Integer maxValue;
        private Integer actualValue;

        public InitializeProgressBar setActualValue(Integer newActualValue) {
            this.actualValue = newActualValue;
            return this;
        }

        public InitializeProgressBar setMaxValue(Integer newMaxValue) {
            this.maxValue = newMaxValue;
            return this;
        }

        public InitializeProgressBar setProgressBarType(ProgressBarType newBarType) {
            this.pBType = newBarType;
            return this;
        }

        public ProgressBar create() {
            ProgressBar pBar = new ProgressBar();
            pBar.pBType = pBType;
            pBar.maxValue = maxValue;
            pBar.actualValue = actualValue;

            return pBar;
        }

    }

    public void update(Integer updatedActualValue) {
        this.actualValue = updatedActualValue;
        this.percent = (this.actualValue * 100) / this.maxValue;

        if (this.pBType.equals(ProgressBarType.PERCENT)) {
            String string = '\r' +
                    String.join("", Collections.nCopies(percent == 0 ? 2 : 2 - (int) (Math.log10(percent)), " ")) +
                    String.format(" %d%% ", percent) +
                    String.format(" %d/%d", actualValue, maxValue);

            System.out.print(string);

        } else {
            String string = '\r' +
                    String.join("", Collections.nCopies(percent == 0 ? 2 : 2 - (int) (Math.log10(percent)), " ")) +
                    String.format(" %d%% [", percent) +
                    String.join("", Collections.nCopies(percent, "=")) +
                    '>' +
                    String.join("", Collections.nCopies(100 - percent, " ")) +
                    ']' +
                    String.join("", Collections.nCopies((int) ((long) (Math.log10(maxValue)) - (long) (Math.log10(actualValue))), " ")) +
                    String.format(" %d/%d", actualValue, maxValue);

            System.out.print(string);
        }
    }

    public ProgressBarType getpBType() {
        return pBType;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public Integer getActualValue() {
        return actualValue;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public void setActualValue(Integer actualValue) {
        this.actualValue = actualValue;
    }

    public void setpBType(ProgressBarType pBType) {
        this.pBType = pBType;
    }
}