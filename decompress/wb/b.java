// 
// Decompiled by Procyon v0.6.0
// 

package wb;

import pb.a$b;

public abstract class b implements a$b
{
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        String concat;
        if (simpleName.length() != 0) {
            concat = "SCTE-35 splice command: type=".concat(simpleName);
        }
        else {
            concat = new String("SCTE-35 splice command: type=");
        }
        return concat;
    }
}
