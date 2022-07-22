# ProgressBarApi
A simple progress bar api for java deveopers

# Documentation

```java
ProgressBar pbar = new ProgressBar.InitializeProgressBar().setProgressBarType(ProgressBarType.[type of progress bar]).setActualValue(0).setMaxValue([max value ]).create();

int i = 0;
while (i != 2501) {
  pbar.update(i);
  i++;
}

```
