public class Main {
//    public static void main(String[] args) {
//        Map<String, Integer> wordHistogram= new HashMap<>();
//            String phrase= "Hello there ho ho ho ho";
//            String [] myArray= phrase.split(" ");
//
//            for (String s: myArray){
//                if (wordHistogram.containsKey(s)){
//                    Integer frequency= wordHistogram.get(s);
//                    wordHistogram.put(s, frequency+1);
//                }else{
//                wordHistogram.put(s, 1);
//            }
//    }
//            wordHistogram.forEach((word, frequency) ->{
//            System.out.println("The word: " + word + "appears " + frequency + "times");
//            });
//    }};


    public static void main(String[] args) {

        Map <String, Integer> wordHistogram2= new TreeMap<>();

        String phrase= "oh la la la la la la la la la";
        String [] song= phrase.split(" ");

        for (String s: song){
            if (wordHistogram2.containsKey(s)){
                Integer frequency= wordHistogram2.get(s);
                wordHistogram2.put(s, frequency+1);
                }else{
                wordHistogram2.put(s, 1);
            }
        }
        wordHistogram2.forEach((word, frequency)->{
                        System.out.println("The word " + word + " appears " + frequency + " times");
        });
    }}
