package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 15055494 on 16/7/2018.
 */

public class FormulaItem {
    private String title;
    private String formula;
    private String type;


    public FormulaItem(String title, String formula, String type) {
        this.title = title;
        this.formula = formula;
        this.type = type;
    }

    public String getTitle(){
        return title;
    }

    public String getFormula(){
        return formula;
    }

    public String getType() {return type;}
    public String toString(){
        return "Basic Math Formula{" + "title='"+title+"\'"+", formula='"+formula+"\'"+", type='"+type+"\'"+"}";
    }
}
