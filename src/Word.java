/**
 * Created by dylan on 12/09/16.
 */
public class Word {
    //Testing for making a new class on a new branch
    private String _name;
    private int _level;
    private int _mastered;

    Word(String name, int level){
        _name = name; //rip
        _level = level;
    }

    public void mastered(){
        _mastered++;
    }
}
