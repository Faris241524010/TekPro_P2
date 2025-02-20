public class Soal4 //class ConvertDataType
{
    static short methodOne(long l)
    {
        //long l ditype cast ke integer dan disimpan ke integer i
        int i = (int) l;
        //mengembalikan nilai i yang ditype cast ke short
        return (short)i;
    }
    public static void main(String[] args)
    {
        //inisiasi double
        double d = 10.25;
        //type cast d yang bertype double ke float
        float f = (float) d;
        //type cast pemanggilan methodOne dengan parameter f yang diubah dari float ke long yang mengembalikan short
        byte b = (byte) methodOne((long) f);
        //print hasil akhir b
        System.out.println(b);
    }
}
