import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B15155A0-7FD5-F9FC-ED5C-F7F1CFBEE68F]
// </editor-fold> 
public class Instructor {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0E3D6D5B-4A3A-39F7-2CA8-FF1D2FC107FA]
    // </editor-fold> 
    private String inst_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D8EF481-4F31-59A9-611B-322760FBF581]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.32FDE9D1-9C59-825B-0447-08EE384FEDF0]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3B505802-438F-8CC7-2C1A-84EF76EDCF0F]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.81615740-D941-6409-61A7-4444518BE38D]
    // </editor-fold> 
    public Instructor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F4C36D9F-7A83-BC37-E565-5EAD996DF148]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6683F55-AB99-27E6-9E0B-323074CD9FBA]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5185757B-15DE-F296-E0D5-1929E09FFE5A]
    // </editor-fold> 
    public String getInst_id () {
        return inst_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6F7191B-94BF-A59E-3170-461ABA002EB8]
    // </editor-fold> 
    public void setInst_id (String val) {
        this.inst_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8DF5E7D-3F9B-2360-36AA-1E22219B06D6]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.55A1AD66-60A5-CF08-B890-42BC19C0BB22]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E38FCF57-03C6-4C4E-33F7-9638A444D29E]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A1C04F5F-9577-0788-CE24-98E1F6F12DD5]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }
    public String StringData(){
    return this.getInst_id()+" "+this.getName();
    }
}

