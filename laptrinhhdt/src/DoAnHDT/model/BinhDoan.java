package DoAnHDT.model;

import java.util.ArrayList;
import java.util.List;

// Class BinhDoan
public class BinhDoan {
    List<KyBinh> dskb;
    DoiQuan doiQuan;

    public BinhDoan() {
        dskb = new ArrayList<>();
    }

    public void addKyBinh(KyBinh kyBinh) {
        dskb.add(kyBinh);
    }
}