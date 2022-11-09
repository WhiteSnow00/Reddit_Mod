// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;

public final class 2Hr implements 4NB
{
    public final /* synthetic */ LandscapeFragmentPanel LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ CdE LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ int LJI;
    
    static {
        Covode.recordClassIndex(82074);
    }
    
    public 2Hr(final LandscapeFragmentPanel liz, final Aweme liziz, final String lizj, final int lizlll, final CdE lj, final String ljff, final int lji) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJI = lji;
    }
    
    @Override
    public final void LIZ() {
        if (this.LIZ.LJ != null) {
            final 2Ib lj = this.LIZ.LJ;
            if (lj == null) {
                n.LIZIZ();
            }
            if (lj.ew_()) {
                this.LIZ.LIZ(this.LIZIZ, this.LIZJ, true, this.LIZLLL, this.LJ);
                final 2Ib lj2 = this.LIZ.LJ;
                if (lj2 == null) {
                    n.LIZIZ();
                }
                final OK5 ok5 = new OK5();
                ok5.LIZ(this.LIZJ);
                ok5.LIZIZ(this.LJFF);
                boolean b = false;
                Label_0136: {
                    if (!this.LIZIZ.getAuthor().isSecret()) {
                        final User author = this.LIZIZ.getAuthor();
                        n.LIZIZ((Object)author, "");
                        if (!author.isPrivateAccount()) {
                            b = false;
                            break Label_0136;
                        }
                    }
                    b = true;
                }
                ok5.LIZ(b);
                ok5.LIZ(1);
                ok5.LIZJ(this.LIZ.LJIIIZ());
                ok5.LIZLLL(50f.LJFF(this.LIZ.LJZL()));
                ok5.LIZ(this.LIZIZ);
                ok5.LJ(this.LJ.LJ);
                ok5.LIZJ(2JO.LIZ.LIZ(this.LIZ.LJII.getEventType()));
                ok5.LIZIZ(2JO.LIZ.LIZ(this.LIZ.LJII.getEventType(), this.LIZIZ.getRelationLabel()));
                ok5.LJ(this.LJI);
                final User author2 = this.LIZIZ.getAuthor();
                n.LIZIZ((Object)author2, "");
                ok5.LJFF(author2.getAccurateRecType());
                lj2.LIZ(ok5.LIZ());
            }
        }
    }
    
    @Override
    public final void LIZIZ() {
    }
}
