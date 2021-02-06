import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.15FD0792-7053-9F61-EFEC-5CC6C4336DDC]
// </editor-fold> 
public class University {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86B75B0B-164A-E80D-81D5-E9AC8D094F90]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC02675A-9546-E42E-738F-C0FC3DDD10D8]
    // </editor-fold> 
    private String address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D5E5135D-21AD-0151-0057-8A7BF156C83B]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CDDFDC4F-CB4D-F0B9-BA99-1EE449590E1B]
    // </editor-fold> 
    private ArrayList<Instructor> instructors = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E590A01B-8D3D-95BF-C80B-553B444597B4]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2CE3ABE5-A691-CE71-C1FF-1F3C30D40206]
    // </editor-fold> 
    public University () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9CFC913F-9673-63E9-AA78-D5ABEFFB1DDB]
    // </editor-fold> 
    public String getAddress () {
        return address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.138C1F93-BBCD-6E39-8E94-D30AFC41DE8C]
    // </editor-fold> 
    public void setAddress (String val) {
        this.address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F6540095-F263-E117-455E-F63DFF553F22]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17E5DD73-CD34-364B-B04E-73B671F6FCDF]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E9A1106-71B6-64FB-C830-CABF1489F9FF]
    // </editor-fold> 
    public ArrayList<Instructor> getInstructors () {
        return instructors;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A3C7391-520B-A092-2F47-024CD8ED0C48]
    // </editor-fold> 
    public void setInstructors (ArrayList<Instructor> val) {
        this.instructors = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.333902A5-B96D-C447-89F8-0B65BC1E75E5]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3512BD68-89BF-1252-F377-E6C1EB0C704B]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52D9E6D4-46F7-C1B9-B88B-89F86AF79D5A]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AC426344-A0F8-F88A-CA04-DCB21ADA72C7]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

}

