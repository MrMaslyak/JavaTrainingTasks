public class Main {

    public static void main(String[] args) {
        System.out.println("Book of Potions The Witcher 3");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        String alkahest = "Alkahest";
        String leaves = "Dog parsley leaves";
        String cobweb = "Cobweb";
        String endriagiEmbryo = "EndriagiEmbryo";
        String grom = "Grom";
        String finishProduct = "Update-Grom";
        HowCreateElixirWitcher3(2, alkahest, leaves, cobweb, endriagiEmbryo, grom, finishProduct );
        System.out.println("-------------------------------------------------------------------------------------");
        String alkahest1 = "Alkahest";
        String stepover = "Step over";
        String skorocel = "Skorocel";
        String neckersHeart = "Necker's heart";
        String raffarTheWhitePotion = "Raffar the White's Potion";
        String finishProduct1 = "Improved Potion of Raffar the White";
        HowCreateElixirWitcher3(4, alkahest1,stepover,  skorocel, neckersHeart, raffarTheWhitePotion, finishProduct1 );
    }

    public static void HowCreateElixirWitcher3(int quantity, String ingrt1, String ingrt2, String ingrt3, String ingrt4, String ingrt5, String finishProduct) {
        String tIngridient = "Take " + ingrt1;
        String tIngridient1 = "Take " + ingrt2;
        String tIngridient2 = "Take " + ingrt3 + " "+ quantity + " numbers";
        String tIngridient3 = "Take " + ingrt4 + " "+ quantity + " numbers";
        String tIngridient4 = "Take " + ingrt5;
        String pregress = "Stir this ingridients";
        String finish = "Congratulations you created Elixir - " + finishProduct;

        System.out.println(tIngridient);
        System.out.println(tIngridient1);
        System.out.println(tIngridient2);
        System.out.println(tIngridient3);
        System.out.println(tIngridient4);
        System.out.println(pregress);
        System.out.println(finish);
    }
}