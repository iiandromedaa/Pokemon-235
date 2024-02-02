public class Pokemon {

    //wooag uoag !!! private for *ENCAPSULATION*
    private String species;
    private String nickname;
    private String type;
    private int level;

    /**
     * @param species species of the pokemon (e.g pikachu, charmander, shaymin)
     * @param nickname nickname for the pokemon
     * @param type1 the first type for the pokemon
     * @param type2 the pokemon's second type
     * @param level pokemon's level
     */
    Pokemon(String species, String nickname, String type, int level) {
        this.species = species;
        this.nickname = nickname;
        this.type = type;
        this.level = level;
    }

    /**
     * lazy constructor
     * @param species species of the pokemon (e.g pikachu, charmander, shaymin)
     * @param type1 the first type for the pokemon
     * @param type2 the pokemon's second type
     */
    Pokemon(String species, String type) {
        this.species = species;
        this.type = type;
        level = 1;
    }

    /**
     * increments level by 1
     */
    void levelUp() {
        level++;
    }

    /**
     * @param nickname nickname to be set
     */
    void changeNick(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return pokemon's level
     */
    int getLevel() {
        return level;
    }

    /**
     * @return pokemon's nickname (MAY RETURN NULL, at whichpoint fall back to using pokemon's species as name)
     */
    String getNick() {
        return nickname;
    }

    /**
     * @return pokemon's type
     */
    String getType() {
        return type;
    }

    /**
     * @return pokemon's species
     */
    String getSpecies() {
        return species;
    }
}
