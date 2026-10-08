class Badge {
    public String print(Integer id, String name, String department) {

        /*
        String departmentPlaceholder = department; 
        departmentPlaceholder = departmentPlaceholder.toUpperCase(); 

        if (department == null) {
            if (id == null) {
            return name + " - " + "OWNER";
            } else {
                return "[" + id + "] - " + name + " - " + "OWNER";
            }
            
        }
    
        if (id == null) {
            return name + " - " + departmentPlaceholder;
        }

        
        return "[" + id + "] - " + name + " - " + departmentPlaceholder;
        */

        //

        String departmentPlaceholder = department;
        
        if (department == null) {
            
            if (id == null) {
            return name + " - " + "OWNER";
            } else {
                return "[" + id + "] - " + name + " - " + "OWNER";
            }

            
        } else if (id == null) {
            departmentPlaceholder = departmentPlaceholder.toUpperCase(); 
            return name + " - " + departmentPlaceholder;
        } else {
            departmentPlaceholder = departmentPlaceholder.toUpperCase(); 
            return "[" + id + "] - " + name + " - " + departmentPlaceholder;
        }

        //return "[" + id + "] - " + name + " - " + departmentPlaceholder;





        
    }
}
