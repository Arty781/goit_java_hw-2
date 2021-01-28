public class NameEncoderDecoder {
    public String encode(String name) {
        String enc = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + enc + "YESNOTFORYOU";
    }

    public String decode(String name) {
        return name
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a")
                .replaceFirst("NOTFORYOU", "")
                .replaceFirst("YESNOTFORYOU", "");
    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
        //Encode
        String encode = names.encode("Crab");
        System.out.println("names.makeEncode(\"Crab\") = " + encode);

        //DEcode
        String decode = names.decode(encode);
        System.out.println("names.makeDecode(\"Crab\") = " + decode);

        //DEcode
        String decode1 = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("names.makeDecode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + decode1);


    }

}
