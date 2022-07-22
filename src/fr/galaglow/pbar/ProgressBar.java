package fr.galaglow.pbar;

import fr.galaglow.pbar.utils.ProgressBarType;

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
        setActualValue(updatedActualValue);
        this.percent = (this.actualValue / this.maxValue) * 100;

        if (this.pBType.equals(ProgressBarType.PERCENT)) {
            System.out.println(percent + "%");
        } else {
            if (percent < 10) {
                System.out.println("[----------] " + percent + "%");
            } else if (percent >= 10 && percent < 20) {
                System.out.println("[=---------] " + percent + "%");
            } else if (percent >= 20 && percent < 30) {
                System.out.println("[==--------] " + percent + "%");
            } else if (percent >= 30 && percent < 40) {
                System.out.println("[===-------] " + percent + "%");
            } else if (percent >= 40 && percent < 50) {
                System.out.println("[====------] " + percent + "%");
            } else if (percent >= 50 && percent < 60) {
                System.out.println("[=====-----] " + percent + "%");
            } else if (percent >= 60 && percent < 70) {
                System.out.println("[======----] " + percent + "%");
            } else if (percent >= 70 && percent < 80) {
                System.out.println("[=======---] " + percent + "%");
            } else if (percent >= 80 && percent < 90) {
                System.out.println("[========--] " + percent + "%");
            } else if (percent >= 90 && percent < 100) {
                System.out.println("[=========-] " + percent + "%");
            } else if (percent == 100) {
                System.out.println("[==========] " + percent + "%");
            }
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
