import java.io.* ;

class Weight {
  int[] data;
  
  Weight(int[] init) {
    data = new int[init.length];
    
    for (int i=0; i<init.length; i++) {
      data[i] = init[i];
    }
  }
  
  public String toString(int i) {
  
  }
}

class WeightTester {
  public static void main(String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight(values);
    System.out.println(june);
  }
}


     