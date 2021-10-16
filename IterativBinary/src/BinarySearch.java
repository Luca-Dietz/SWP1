
class BinarySearch {
	
    public static int binarySearch(int arr[], int x)
    {
        int lower = 0;
        int higher = arr.length - 1;
        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
            	lower = mid + 1;
            }else {
            	higher = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 1, 2, 3, 4, 5, 8, 9, 12, 1334};
        int n = arr.length;
        int x = 1;
        int position = binarySearch(arr, x);
        if (position == -1) {
            System.out.println("Zahl nicht enthalten");
        }else {
            System.out.println("Zahl wurde an folgendem Index gefunden: " + position);
        }
    }
}