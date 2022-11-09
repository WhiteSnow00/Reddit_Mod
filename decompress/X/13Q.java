// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class 13q extends 05G
{
    public ArrayList<05G> LJIJJ;
    
    static {
        Covode.recordClassIndex(619);
    }
    
    public 13q() {
        this.LJIJJ = new ArrayList<05G>();
    }
    
    public void LIZ() {
        this.updateDrawPosition();
        final ArrayList<05G> ljijj = this.LJIJJ;
        if (ljijj == null) {
            return;
        }
        for (int size = ljijj.size(), i = 0; i < size; ++i) {
            final 05G 05G = this.LJIJJ.get(i);
            if (05G instanceof 13q) {
                ((13q)05G).LIZ();
            }
        }
    }
    
    public final void LIZ(final 05G 05G) {
        this.LJIJJ.remove(05G);
        05G.mParent = null;
    }
    
    @Override
    public void reset() {
        this.LJIJJ.clear();
        super.reset();
    }
    
    @Override
    public void resetSolverVariables(final 05O 05O) {
        super.resetSolverVariables(05O);
        for (int size = this.LJIJJ.size(), i = 0; i < size; ++i) {
            this.LJIJJ.get(i).resetSolverVariables(05O);
        }
    }
    
    @Override
    public void setOffset(int i, int size) {
        super.setOffset(i, size);
        for (size = this.LJIJJ.size(), i = 0; i < size; ++i) {
            this.LJIJJ.get(i).setOffset(this.getRootX(), this.getRootY());
        }
    }
    
    @Override
    public void updateDrawPosition() {
        super.updateDrawPosition();
        final ArrayList<05G> ljijj = this.LJIJJ;
        if (ljijj == null) {
            return;
        }
        for (int size = ljijj.size(), i = 0; i < size; ++i) {
            final 05G 05G = this.LJIJJ.get(i);
            05G.setOffset(this.getDrawX(), this.getDrawY());
            if (!(05G instanceof 1fh)) {
                05G.updateDrawPosition();
            }
        }
    }
}
