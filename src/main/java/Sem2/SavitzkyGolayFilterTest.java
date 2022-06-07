import java.util.*;

public class SavitzkyGolayFilterTest {
    public static void main(String[] args){
        double [] data = new double[800];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 800; i++){
            data[i] = (12 * Math.pow((double)(i / 150),2) -
                    5 * Math.pow(Math.E,-Math.pow((double)((i-400) / 20), 2)));
        }
        int [] zero = {0, 0,-3,12,17,12,-3, 0, 0};
        int [] one = {  0,-2, 3, 6, 7, 6, 3,-2,  0};
        int [] two = {-21,14,39,54,59,54,39,14,-21};
        int [] three = { 0,  5,-30, 75,131, 75,-30,  5, 0};
        int [] four = {15,-55, 30,135,179,135, 30,-55,15};
        int [] five = { 0, 0, 0,-1,0,1,0,0,0};
        int [] six = { 0, 0,-2,-1,0,1,2,0,0};
        int [] seven = { 0,-3,-2,-1,0,1,2,3,0};
        int [] eight =  {-4,-3,-2,-1,0,1,2,3,4};
        int [] nine = { 0,   0,   1,  -8,0,  8, -1,  0,  0};
        int [] ten = { 0,  22, -67, -58,0, 58, 67,-22,  0};
        int [] eleven = {86,-142,-193,-126,0,126,193,142,-86};

        // provide user prompts to specify Savitsky-Golay numbers
        System.out.println("select Savitsky-Golay filter: ");
        System.out.println("smoothing");
        System.out.println(" quadratic or cubic");
        System.out.println("  0   {  0, 0,-3,12,17,12,-3, 0,  0}");
        System.out.println("  1   {  0,-2, 3, 6, 7, 6, 3,-2,  0}");
        System.out.println("  2   {-21,14,39,54,59,54,39,14,-21}");

        System.out.println(" quartic or quintic");
        System.out.println("  3   { 0,  5,-30, 75,131, 75,-30,  5, 0}");
        System.out.println("  4   {15,-55, 30,135,179,135, 30,-55,15}");

        System.out.println();

        System.out.println("1st derivative");
        System.out.println(" linear or quadratic");
        System.out.println("  5   { 0, 0, 0,-1,0,1,0,0,0}");
        System.out.println("  6   { 0, 0,-2,-1,0,1,2,0,0}");
        System.out.println("  7   { 0,-3,-2,-1,0,1,2,3,0}");
        System.out.println("  8   {-4,-3,-2,-1,0,1,2,3,4}");

        System.out.println(" cubic or quartic");
        System.out.println("  9   { 0,   0,   1,  -8,0,  8, -1,  0,  0}");
        System.out.println("  10  { 0,  22, -67, -58,0, 58, 67,-22,  0}");
        System.out.println("  11  {86,-142,-193,-126,0,126,193,142,-86}");

        // select filter
        System.out.print("Enter an integer 0 - 11 corresponding to desired filter: ");
        int key = scanner.nextInt();
        System.out.println();

        int [] nums = new int [9];

        if(key == 0){
            nums = zero.clone();
        } else if(key == 1){
            nums = one.clone();
        } else if(key == 2){
            nums = two.clone();
        } else if(key == 3){
            nums = three.clone();
        } else if(key == 4){
            nums = four.clone();
        } else if(key == 5){
            nums = five.clone();
        } else if(key == 6){
            nums = six.clone();
        } else if(key == 7){
            nums = seven.clone();
        } else if(key == 8){
            nums = eight.clone();
        } else if(key == 9){
            nums = nine.clone();
        } else if(key == 10){
            nums = ten.clone();
        } else if(key == 11){
            nums = eleven.clone();
        }

        double [] newData = new double[790];

        for(int i = 5; i < 794; i++){
            newData[i-4] = nums[0]*data[i-4]+ nums[1]*data[i-3]+ nums[2]*data[i-2]+
                    nums[3]*data[i-1]+ nums[4]*data[i]+ nums[5]*data[i+1]+
                    nums[6]*data[i+2]+ nums[7]*data[i+3]+ nums[8]*data[i+4];
        }
        System.out.println(Arrays.toString(newData));
    }
}
