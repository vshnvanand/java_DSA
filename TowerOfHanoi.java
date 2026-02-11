public class TowerOfHanoi {

    public static void tower(int disk, String source, String helper, String dest) {
        if(disk == 1){
            System.out.println("transfer disk " + disk + "from " + source + " to " + dest);
            return ;
        }

        tower(disk-1, source, dest, helper);
        System.out.println("Transfered disk" + disk+ " from " + source +" to " + dest);
        tower(disk-1, helper, source, dest);
    }
    public static void main(String[] args) {
        int disks = 4;
        tower(disks, "S", "H", "D");
    }
}
