import java.io.* ;

class Smooth {
  public static void main (String[] args) {
    int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
    int[] smooth = new int[signal.length];
    
    smooth[0] = (signal[0] + signal[1]) / 2;
    smooth[signal.length-1] = (signal[signal.length-1] + signal[signal.length-2]) / 2;
    for (int i=1; i<signal.length-1; i++) {
        smooth[i] = (signal[i-1] + signal[i] + signal[i+1]) / 3;
    }
      
    for (int i=0; i<smooth.length; i++) {
        System.out.print(signal[i] + " ");
    }

    System.out.println("\n");
    
    for (int i=0; i<smooth.length; i++) {
        System.out.print(smooth[i] + " ");
    }
  }
}

