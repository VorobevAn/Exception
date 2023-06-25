import java.util.Date;
import java.util.Scanner;


public class Mai {
    public static void main(String[] args) {
        task1();
    }

    // РќРµРѕР±С…РѕРґРёРјРѕ РЅР°РїРёСЃР°С‚СЊ Р°Р»РіРѕСЂРёС‚Рј, СЃС‡РёС‚Р°СЋС‰РёР№ СЃСѓРјРјСѓ РІСЃРµС… С‡РёСЃРµР» РѕС‚ 1 РґРѕ N.
    public static void task1(){ // O(n)
        Scanner sc = new Scanner(System.in);
        System.out.print("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // O(n^2)
        System.out.println(sum);
        sc.close();
    }

    // РќР°РїРёСЃР°С‚СЊ Р°Р»РіРѕСЂРёС‚Рј РїРѕРёСЃРєР° РїСЂРѕСЃС‚С‹С… С‡РёСЃРµР» (РґРµР»СЏС‚СЃСЏ С‚РѕР»СЊРєРѕ РЅР° СЃРµР±СЏ Рё РЅР° 1) РІ
    // РґРёР°РїР°Р·РѕРЅРµ РѕС‚ 1 РґРѕ N.
    public static void task2(){  // O(n^2)
        boolean flag;
        for (int i = 2; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                }
            }
            if (flag){
                System.out.print(i + " ");
            }
        }
        for (int i = 0; i < 10; i++) {
            //...
        }
    }

    // РќРµРѕР±С…РѕРґРёРјРѕ РЅР°РїРёСЃР°С‚СЊ Р°Р»РіРѕСЂРёС‚Рј РїРѕРёСЃРєР° РІСЃРµС… РґРѕСЃС‚СѓРїРЅС‹С… РєРѕРјР±РёРЅР°С†РёР№
    // (РїРѕСЃС‡РёС‚Р°С‚СЊ РєРѕР»РёС‡РµСЃС‚РІРѕ)
    // РґР»СЏ РєРѕР»РёС‡РµСЃС‚РІР° РєСѓР±РёРєРѕРІ K СЃ РєРѕР»РёС‡РµСЃС‚РІРѕРј РіСЂР°РЅРµР№ N
    public static void task3(){
        int count = 4;
        int faces = 6;
        System.out.println(recursiveCount(1, count, faces));
    }

    public static int recursiveCount(int countNow, int MaxCount, int faces){ //O(n^k)
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (countNow == MaxCount){
                count++;
            }
            else{
                count += recursiveCount(countNow+1, MaxCount, faces);
            }
        }
        return count;

        // for (int i = 0; i < faces; i++) {  //O(n^4)
        //     for (int j = 0; j < faces; j++) {
        //         for (int j2 = 0; j2 < faces; j2++) {
        //             for (int k = 0; k < faces; k++) {
        //                 count ++;
        //             }
        //         }
        //     }
        // }
        // return count;
    }


    // РџРёС€РµРј Р°Р»РіРѕСЂРёС‚Рј РїРѕРёСЃРєР° РЅСѓР¶РЅРѕРіРѕ С‡РёСЃР»Р° РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё Р¤РёР±РѕРЅР°С‡С‡Рё.
    // РЎС‡РёС‚Р°РµРј, С‡С‚Рѕ 1 Рё 2 Р·РЅР°С‡РµРЅРёСЏ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё СЂР°РІРЅС‹ 1

    public static void task4(){
        int n = 50;
        Date startDate = new Date();
        System.out.println(fb(n));
        Date endDate = new Date();
        System.out.print("Р РµС€РµРЅРёРµ С‡РµСЂРµР· СЂРµРєСѓСЂСЃРёСЋ: ");
        System.out.println(endDate.getTime() - startDate.getTime());
        Date startDate2 = new Date();
        System.out.println(fb2(n));
        Date endDate2 = new Date();
        System.out.print("Р РµС€РµРЅРёРµ Р»РёРЅРµР№РЅРѕРµ: ");
        long chis = endDate2.getTime() - startDate2.getTime();
        System.out.println(chis);
    }

    public static int fb(int num){
        // 1 1 2 3
        // On = On-1 + On-2
        if (num <= 2){
            return 1;
        }
        else{
            return fb(num-1) + fb(num-2);
        }
    }

    public static int fb2(int num){
        if (num <= 2){
            return 1;
        }
        int [] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[num-1];
    }

}