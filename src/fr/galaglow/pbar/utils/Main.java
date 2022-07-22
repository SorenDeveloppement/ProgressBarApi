package fr.galaglow.pbar.utils;

import fr.galaglow.pbar.ProgressBar;

public class Main {
    public static void main(String[] args) {
        ProgressBar pbar = new ProgressBar.InitializeProgressBar().setProgressBarType(ProgressBarType.BAR).setActualValue(0).setMaxValue(2500).create();

        int i = 0;
        while (i != 2501) {
            pbar.update(i);
            i++;
        }
    }
}
