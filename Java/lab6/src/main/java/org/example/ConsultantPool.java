package org.example;

import java.util.LinkedList;
import java.util.List;

public class ConsultantPool {
    public List<Consultant> free = new LinkedList<Consultant>() {{
        add(new Consultant("Ivanius", "Popodolopus", 20));
        add(new Consultant("Okun", "Karas", 20));
        add(new Consultant("Karas", "Karas", 20));
    }};
    public List<Consultant> used = new LinkedList<>();
    public Consultant getConsultant() {
        if (free.isEmpty()) {
            return null;
        } else {
            Consultant consultant = free.get(0);
            used.add(consultant);
            free.remove(consultant);
            return consultant;
        }
    }
    public void returnConsultant(Consultant consultant) {
        used.remove(consultant);
        free.add(consultant);
    }
}
