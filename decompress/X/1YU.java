// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.HashMap;
import android.view.ViewGroup;

public final class 1YU implements a, 0tN
{
    public ViewGroup LIZ;
    public int LIZIZ;
    public int LIZJ;
    public HashMap<Integer, LinkPlayerInfo> LIZLLL;
    
    static {
        Covode.recordClassIndex(9305);
    }
    
    public 1YU(final int lizj) {
        this.LIZIZ = 4;
        this.LIZJ = lizj;
        this.LIZLLL = new HashMap<Integer, LinkPlayerInfo>();
    }
    
    @Override
    public final void LIZ(final 0xa 0xa) {
        CTM.LIZ((Object)0xa);
        final int lizj = this.LIZJ;
        int n;
        if (0xa.LJI == 3) {
            n = 1;
        }
        else {
            n = 0;
        }
        while (true) {
            for (final 0xc 0xc : 0xa.LJ) {
                if (lizj == 0xc.LJIILIIL) {
                    int liziz;
                    if (0xc.LJIILL) {
                        liziz = 2;
                    }
                    else {
                        liziz = 1;
                    }
                    if (liziz != this.LIZIZ) {
                        Label_0096: {
                            if (liziz != 1) {
                                if (liziz != 2) {
                                    if (liziz != 3) {
                                        if (liziz == 4) {
                                            final ViewGroup liz = this.LIZ;
                                            if (liz != null) {
                                                final FrameLayout frameLayout = (FrameLayout)((View)liz).findViewById(2131365358);
                                                if (frameLayout != null) {
                                                    frameLayout.setVisibility(0);
                                                }
                                            }
                                            final ViewGroup liz2 = this.LIZ;
                                            if (liz2 != null) {
                                                final FrameLayout frameLayout2 = (FrameLayout)((View)liz2).findViewById(2131365357);
                                                if (frameLayout2 != null) {
                                                    frameLayout2.setVisibility(8);
                                                }
                                            }
                                            final ViewGroup liz3 = this.LIZ;
                                            if (liz3 != null) {
                                                final FrameLayout frameLayout3 = (FrameLayout)((View)liz3).findViewById(2131365358);
                                                if (frameLayout3 != null) {
                                                    final 1si 1si = (1si)((View)frameLayout3).findViewById(2131366795);
                                                    if (1si != null) {
                                                        1si.setVisibility(8);
                                                    }
                                                }
                                            }
                                            final ViewGroup liz4 = this.LIZ;
                                            if (liz4 != null) {
                                                final FrameLayout frameLayout4 = (FrameLayout)((View)liz4).findViewById(2131365358);
                                                if (frameLayout4 != null) {
                                                    final LinearLayout linearLayout = (LinearLayout)((View)frameLayout4).findViewById(2131367799);
                                                    if (linearLayout != null) {
                                                        linearLayout.setVisibility(0);
                                                    }
                                                }
                                            }
                                            final ViewGroup liz5 = this.LIZ;
                                            if (liz5 != null) {
                                                liz5.setVisibility(0);
                                            }
                                        }
                                    }
                                    else {
                                        final ViewGroup liz6 = this.LIZ;
                                        if (liz6 != null) {
                                            final FrameLayout frameLayout5 = (FrameLayout)((View)liz6).findViewById(2131365358);
                                            if (frameLayout5 != null) {
                                                frameLayout5.setVisibility(0);
                                            }
                                        }
                                        final ViewGroup liz7 = this.LIZ;
                                        if (liz7 != null) {
                                            final FrameLayout frameLayout6 = (FrameLayout)((View)liz7).findViewById(2131365358);
                                            if (frameLayout6 != null) {
                                                final 1si 1si2 = (1si)((View)frameLayout6).findViewById(2131366795);
                                                if (1si2 != null) {
                                                    1si2.setVisibility(0);
                                                }
                                            }
                                        }
                                        final ViewGroup liz8 = this.LIZ;
                                        if (liz8 != null) {
                                            final FrameLayout frameLayout7 = (FrameLayout)((View)liz8).findViewById(2131365358);
                                            if (frameLayout7 != null) {
                                                final LinearLayout linearLayout2 = (LinearLayout)((View)frameLayout7).findViewById(2131367799);
                                                if (linearLayout2 != null) {
                                                    linearLayout2.setVisibility(8);
                                                }
                                            }
                                        }
                                        final ViewGroup liz9 = this.LIZ;
                                        if (liz9 != null) {
                                            liz9.setVisibility(0);
                                        }
                                    }
                                }
                                else {
                                    final LinkPlayerInfo linkPlayerInfo = this.LIZLLL.get(this.LIZJ);
                                    if (linkPlayerInfo == null) {
                                        return;
                                    }
                                    final ViewGroup liz10 = this.LIZ;
                                    if (liz10 != null) {
                                        final FrameLayout frameLayout8 = (FrameLayout)((View)liz10).findViewById(2131365358);
                                        if (frameLayout8 != null) {
                                            frameLayout8.setVisibility(8);
                                        }
                                    }
                                    final ViewGroup liz11 = this.LIZ;
                                    if (liz11 != null) {
                                        final FrameLayout frameLayout9 = (FrameLayout)((View)liz11).findViewById(2131365357);
                                        if (frameLayout9 != null) {
                                            frameLayout9.setVisibility(0);
                                        }
                                    }
                                    final User lizj2 = linkPlayerInfo.LIZJ;
                                    final SDe sDe = null;
                                    final View view = null;
                                    ImageModel avatarThumb;
                                    if (lizj2 != null) {
                                        avatarThumb = lizj2.getAvatarThumb();
                                    }
                                    else {
                                        avatarThumb = null;
                                    }
                                    final ViewGroup liz12 = this.LIZ;
                                    while (true) {
                                        Label_0841: {
                                            if (liz12 == null) {
                                                break Label_0841;
                                            }
                                            final FrameLayout frameLayout10 = (FrameLayout)((View)liz12).findViewById(2131365357);
                                            if (frameLayout10 == null) {
                                                break Label_0841;
                                            }
                                            final Object o = ((View)frameLayout10).findViewById(2131367007);
                                            HFv.LIZ((ImageView)o, avatarThumb, 60, 60, 2131234398);
                                            final HZ0 ljiij = new HZ0(5, 0.0f);
                                            if (avatarThumb != null && avatarThumb.getUrls() != null && avatarThumb.getUrls().size() != 0) {
                                                final G18 liz13 = 0cp.LIZ();
                                                0cq.LIZ(liz13, avatarThumb);
                                                liz13.LIZ(0.0f);
                                                final ViewGroup liz14 = this.LIZ;
                                                Object o2 = view;
                                                if (liz14 != null) {
                                                    final FrameLayout frameLayout11 = (FrameLayout)((View)liz14).findViewById(2131365357);
                                                    o2 = view;
                                                    if (frameLayout11 != null) {
                                                        o2 = ((View)frameLayout11).findViewById(2131367009);
                                                    }
                                                }
                                                liz13.LIZ((View)o2);
                                            }
                                            else {
                                                final S8f liz15 = S8f.LIZ(Ql3.LIZ(2131234398));
                                                liz15.LJIIJ = (Qys)ljiij;
                                                final S8e liz16 = liz15.LIZ();
                                                final SAp liziz2 = SBH.LIZIZ();
                                                ((SDU)liziz2).LIZIZ((Object)liz16);
                                                final ViewGroup liz17 = this.LIZ;
                                                SDe controller = sDe;
                                                if (liz17 != null) {
                                                    final FrameLayout frameLayout12 = (FrameLayout)((View)liz17).findViewById(2131365357);
                                                    controller = sDe;
                                                    if (frameLayout12 != null) {
                                                        final SEd sEd = (SEd)((View)frameLayout12).findViewById(2131367009);
                                                        controller = sDe;
                                                        if (sEd != null) {
                                                            controller = sEd.getController();
                                                        }
                                                    }
                                                }
                                                ((SDU)liziz2).LIZ(controller);
                                                final SDT lizj3 = ((SDU)liziz2).LIZJ();
                                                final ViewGroup liz18 = this.LIZ;
                                                if (liz18 != null) {
                                                    final FrameLayout frameLayout13 = (FrameLayout)((View)liz18).findViewById(2131365357);
                                                    if (frameLayout13 != null) {
                                                        final SEd sEd2 = (SEd)((View)frameLayout13).findViewById(2131367009);
                                                        if (sEd2 != null) {
                                                            sEd2.setController((SDe)lizj3);
                                                        }
                                                    }
                                                }
                                            }
                                            final ViewGroup liz19 = this.LIZ;
                                            if (liz19 != null) {
                                                liz19.setVisibility(0);
                                            }
                                            break Label_0096;
                                        }
                                        final Object o = null;
                                        continue;
                                    }
                                }
                            }
                            else {
                                final ViewGroup liz20 = this.LIZ;
                                if (liz20 != null) {
                                    final FrameLayout frameLayout14 = (FrameLayout)((View)liz20).findViewById(2131365357);
                                    if (frameLayout14 != null) {
                                        frameLayout14.setVisibility(8);
                                    }
                                }
                                final ViewGroup liz21 = this.LIZ;
                                if (liz21 != null) {
                                    final FrameLayout frameLayout15 = (FrameLayout)((View)liz21).findViewById(2131365358);
                                    if (frameLayout15 != null) {
                                        frameLayout15.setVisibility(8);
                                    }
                                }
                                final ViewGroup liz22 = this.LIZ;
                                if (liz22 != null) {
                                    liz22.setVisibility(8);
                                }
                            }
                        }
                        this.LIZIZ = liziz;
                    }
                    return;
                }
            }
            if (n != 0) {
                final int liziz = 3;
                continue;
            }
            int liziz = 4;
            continue;
        }
    }
    
    @Override
    public final void LIZ(final 0xa 0xa, final HashMap<Integer, LinkPlayerInfo> hashMap) {
        CTM.LIZ((Object)hashMap);
        this.LIZLLL.clear();
        this.LIZLLL.putAll(hashMap);
        if (0xa != null) {
            this.LIZ(0xa);
        }
    }
    
    public final void LIZ(ViewGroup liz) {
        MethodCollector.i(10711);
        CTM.LIZ((Object)liz);
        final ViewGroup liz2 = this.LIZ;
        if (liz2 != null) {
            liz.removeView((View)liz2);
        }
        if (this.LIZ == null) {
            this.LIZ = (ViewGroup)0II.LIZ(LayoutInflater.from(liz.getContext()), 2131560671, liz, false);
        }
        liz.addView((View)this.LIZ);
        liz = this.LIZ;
        if (liz != null) {
            liz.setVisibility(0);
            MethodCollector.o(10711);
            return;
        }
        MethodCollector.o(10711);
    }
}
