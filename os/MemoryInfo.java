public class MemoryInfo {
    public static void main(String[] args) {
        // Get the runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Total memory in bytes
        long totalMemory = runtime.totalMemory();

        // Free memory in bytes
        long freeMemory = runtime.freeMemory();

        // Calculate the percentage of free memory
        double freeMemoryPercentage = (double) freeMemory / totalMemory * 100;

        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Free Memory Percentage: " + freeMemoryPercentage + "%");
    }
}
