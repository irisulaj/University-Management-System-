import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D55138DE-4CEF-A244-A495-149CFA5F5E56]
// </editor-fold> 
public class Student {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A6A11F89-960B-D976-365B-61971744A205]
    // </editor-fold> 
    private String st_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18561D98-06F5-9C06-D5A8-9AD0CF84E1FB]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FA1B073F-165A-84D2-8443-B70F44C61E70]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B7DC1C6C-0893-2036-C709-2BA90C46599A]
    // </editor-fold> 
    private Instructor instructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FF28FAFE-3102-CAE4-CE7D-8DE4AD27BA18]
    // </editor-fold> 
    public Student () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9BFAE605-91B3-5BA9-563F-97D6FF9942A7]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BD03236F-907D-F187-6E41-F41FE85C95E3]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ED120782-6C94-35F2-A461-B11C10EFE8C2]
    // </editor-fold> 
    public Instructor getInstructor () {
        return instructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.003E4C7F-5A8D-225B-4BFD-0D954399B1C7]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.instructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DEF2726F-D10B-A052-44D8-2FF5EC278EBC]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.44D530AB-2BE2-A5C1-016C-8E9469BA1940]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5EFE25C8-93BB-094C-40EC-D365B7A5B97F]
    // </editor-fold> 
    public String getSt_id () {
        return st_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.50FA7D00-5731-3075-BB26-A71C506B5F5E]
    // </editor-fold> 
    public void setSt_id (String val) {
        this.st_id = val;
    }
    public String StringData(){
    return this.getSt_id() + " "+this.getName();
    }
    
}

