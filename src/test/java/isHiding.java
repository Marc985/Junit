public class isHiding {
        public static boolean isHidingAnOption(String input) {
            int animalIndex = input.indexOf('A');
            int cacheIndex = input.indexOf('C');
            int playerIndex = input.indexOf('X');
            return playerIndex < cacheIndex && cacheIndex < animalIndex;
        }

    }


