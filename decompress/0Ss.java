// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.widget.LinearLayout;
import android.graphics.drawable.Drawable;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class 0ss extends FrameLayout
{
    public ViewGroup LIZ;
    public ViewGroup LIZIZ;
    public Vvh LIZJ;
    public final DataChannel LIZLLL;
    
    static {
        Covode.recordClassIndex(9026);
    }
    
    public 0ss(final Vvh lizj, final DataChannel lizlll) {
        CTM.LIZ((Object)lizj);
        super(lizj.LJ().getContext());
        MethodCollector.i(9834);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        MethodCollector.o(9834);
    }
    
    private final Drawable LIZ(final float n) {
        Drawable lizj = 0cB.LIZJ(2131234683);
        if (lizj != null) {
            lizj.setAlpha((int)(n * 255.0f));
        }
        else {
            lizj = null;
        }
        return lizj;
    }
    
    private final int getEmptyViewLayoutId() {
        final DataChannel lizlll = this.LIZLLL;
        if (lizlll != null && GTi.LIZJ(lizlll)) {
            return 2131562249;
        }
        return 2131562250;
    }
    
    public final void LIZ() {
        final ViewGroup liziz = this.LIZIZ;
        if (liziz != null) {
            final LinearLayout linearLayout = (LinearLayout)liziz.findViewById(2131367343);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            final 1si 1si = (1si)liziz.findViewById(2131367344);
            if (1si != null) {
                1si.setVisibility(0);
            }
        }
    }
    
    public final void LIZIZ() {
        final ViewGroup liziz = this.LIZIZ;
        if (liziz != null) {
            final LinearLayout linearLayout = (LinearLayout)liziz.findViewById(2131367343);
            Label_0087: {
                if (linearLayout != null && linearLayout.getVisibility() != 0) {
                    linearLayout.setVisibility(0);
                    final DataChannel lizlll = this.LIZLLL;
                    while (true) {
                        Label_0164: {
                            if (lizlll == null) {
                                break Label_0164;
                            }
                            final Room room = (Room)lizlll.LIZIZ((Class)G69.class);
                            if (room == null) {
                                break Label_0164;
                            }
                            final User owner = room.getOwner();
                            if (owner == null) {
                                break Label_0164;
                            }
                            final FollowInfo followInfo = owner.getFollowInfo();
                            if (followInfo == null) {
                                break Label_0164;
                            }
                            final long followStatus = followInfo.getFollowStatus();
                            0xy.LIZ("plus_button", followStatus);
                            break Label_0087;
                        }
                        final long followStatus = 0L;
                        continue;
                    }
                }
            }
            final 1si 1si = (1si)liziz.findViewById(2131367344);
            if (1si != null) {
                1si.setVisibility(8);
            }
            final 1si 1si2 = (1si)liziz.findViewById(2131364852);
            if (1si2 != null) {
                1si2.setBackgroundResource(0);
                final Drawable liz = this.LIZ(1.0f);
                if (liz != null) {
                    ((SEd)1si2).setImageDrawable(liz);
                }
            }
            final 1ib 1ib = (1ib)liziz.findViewById(2131364853);
            if (1ib != null) {
                1ib.setTextColor(-1);
            }
        }
    }
    
    public final void LIZJ() {
        final ViewGroup liziz = this.LIZIZ;
        if (liziz != null) {
            final View viewById = liziz.findViewById(2131367343);
            Label_0084: {
                if (viewById != null && viewById.getVisibility() != 0) {
                    viewById.setVisibility(0);
                    final DataChannel lizlll = this.LIZLLL;
                    while (true) {
                        Label_0166: {
                            if (lizlll == null) {
                                break Label_0166;
                            }
                            final Room room = (Room)lizlll.LIZIZ((Class)G69.class);
                            if (room == null) {
                                break Label_0166;
                            }
                            final User owner = room.getOwner();
                            if (owner == null) {
                                break Label_0166;
                            }
                            final FollowInfo followInfo = owner.getFollowInfo();
                            if (followInfo == null) {
                                break Label_0166;
                            }
                            final long followStatus = followInfo.getFollowStatus();
                            0xy.LIZ("plus_button", followStatus);
                            break Label_0084;
                        }
                        final long followStatus = 0L;
                        continue;
                    }
                }
            }
            final 1si 1si = (1si)liziz.findViewById(2131367344);
            if (1si != null) {
                1si.setVisibility(8);
            }
            final 1si 1si2 = (1si)liziz.findViewById(2131364852);
            if (1si2 != null) {
                final Drawable liz = this.LIZ(0.2f);
                if (liz != null) {
                    1si2.setBackgroundResource(0);
                    ((SEd)1si2).setImageDrawable(liz);
                }
            }
            final 1ib 1ib = (1ib)liziz.findViewById(2131364853);
            if (1ib != null) {
                1ib.setTextColor(0cB.LIZIZ(2131100918));
            }
        }
    }
    
    public final void LIZLLL() {
        final DataChannel lizlll = this.LIZLLL;
        if (lizlll != null && GTi.LIZJ(lizlll)) {
            final int liz = this.LIZJ.LIZ();
            final DataChannel lizlll2 = this.LIZLLL;
            if (lizlll2 != null) {
                lizlll2.LIZJ((Class)2Ff.class, (Object)new 1Yq(liz));
            }
            return;
        }
        final int liz2 = this.LIZJ.LIZ();
        final 1NO liz3 = 1NO.LIZ();
        n.LIZIZ((Object)liz3, "");
        final Integer n = (Integer)liz3.LJIIIZ;
        if ((n == null || n != 2) && 0jz.LIZJ().getLinkMicState() != 5) {
            if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable$default(Gqy.LINK_MIC, (H8A)null, false, 6, (Object)null);
                return;
            }
            0xy.LIZIZ = "plus_button";
            final DataChannel lizlll3 = this.LIZLLL;
            while (true) {
                Label_0210: {
                    if (lizlll3 == null) {
                        break Label_0210;
                    }
                    final Room room = (Room)lizlll3.LIZIZ((Class)G69.class);
                    if (room == null) {
                        break Label_0210;
                    }
                    final User owner = room.getOwner();
                    if (owner == null) {
                        break Label_0210;
                    }
                    final FollowInfo followInfo = owner.getFollowInfo();
                    if (followInfo == null) {
                        break Label_0210;
                    }
                    final long followStatus = followInfo.getFollowStatus();
                    0xt.LIZ("plus_button", followStatus);
                    final DataChannel lizlll4 = this.LIZLLL;
                    if (lizlll4 != null) {
                        lizlll4.LIZJ((Class)2Fq.class, (Object)new 1ZS(liz2, 0, 0, 0, 30));
                        return;
                    }
                    return;
                }
                final long followStatus = 0L;
                continue;
            }
        }
    }
    
    public final DataChannel getMDataChannel() {
        return this.LIZLLL;
    }
    
    public final Vvh getWindow() {
        return this.LIZJ;
    }
    
    public final void onAttachedToWindow() {
        MethodCollector.i(9235);
        super.onAttachedToWindow();
        final View inflate = FrameLayout.inflate(this.getContext(), 2131562398, (ViewGroup)this);
        if (inflate != null) {
            this.LIZ = (ViewGroup)inflate;
            final Context context = this.getContext();
            n.LIZIZ((Object)context, "");
            final int emptyViewLayoutId = this.getEmptyViewLayoutId();
            final 1Uo 1Uo = null;
            Object liz;
            if (emptyViewLayoutId == 0) {
                liz = null;
            }
            else {
                liz = 0II.LIZ(LayoutInflater.from(context), this.getEmptyViewLayoutId(), this.LIZ, false);
            }
            final ViewGroup liziz = (ViewGroup)liz;
            this.LIZIZ = liziz;
            if (liziz != null) {
                final ViewGroup liz2 = this.LIZ;
                if (liz2 != null) {
                    liz2.addView((View)liziz);
                }
                if (!0ql.a.LJIIIIZZ) {
                    final ViewGroup liz3 = this.LIZ;
                    if (liz3 != null) {
                        liz3.setOnClickListener((View$OnClickListener)new 0sr(this));
                    }
                }
                final DataChannel lizlll = this.LIZLLL;
                if (lizlll != null) {
                    final Room room = (Room)lizlll.LIZIZ((Class)G69.class);
                    if (room != null) {
                        if (0tO.LJFF()) {
                            this.LIZ();
                        }
                        else if (0tO.LIZJ(room)) {
                            this.LIZJ();
                        }
                        else {
                            this.LIZIZ();
                        }
                        final DataChannel lizlll2 = this.LIZLLL;
                        lizlll2.LIZIZ((Object)this, (Class)2D4.class, (SRS)new 22X(this));
                        lizlll2.LIZ((Object)this, (Class)GtM.class, (SRS)new 22Y(this));
                    }
                }
                final ViewGroup liz4 = this.LIZ;
                if (liz4 != null && liz4.getChildCount() != 0) {
                    final View child = liz4.getChildAt(0);
                    if (child != null) {
                        if (child instanceof ViewGroup) {
                            final ViewGroup viewGroup = (ViewGroup)child;
                            if (viewGroup.getChildCount() > 0) {
                                final View child2 = viewGroup.getChildAt(0);
                                n.LIZIZ((Object)child2, "");
                                Object layoutParams;
                                if (!((layoutParams = child2.getLayoutParams()) instanceof FrameLayout$LayoutParams)) {
                                    layoutParams = null;
                                }
                                final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
                                if (layoutParams2 != null) {
                                    Object liz5 = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
                                    if (!(liz5 instanceof 1Uo)) {
                                        liz5 = 1Uo;
                                    }
                                    final 1Uo 1Uo2 = (1Uo)liz5;
                                    0k8 0k8 = null;
                                    Label_0310: {
                                        Label_0306: {
                                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
                                            if ((1Uo2 != null && (multiLiveAnchorPanelSettings = 1Uo2.LJFF) != null) || (multiLiveAnchorPanelSettings = GCe.LIZ().LJJII) != null) {
                                                final int liz6 = multiLiveAnchorPanelSettings.LIZ;
                                                final int liziz2 = multiLiveAnchorPanelSettings.LIZIZ;
                                                if (liz6 == 1) {
                                                    if (liziz2 == 0) {
                                                        0k8 = X.0k8.FLOATING_FIX;
                                                        break Label_0310;
                                                    }
                                                }
                                                else if (liz6 != 1) {
                                                    if (liz6 != 0) {
                                                        break Label_0306;
                                                    }
                                                    if (liziz2 == 0) {
                                                        0k8 = X.0k8.GRID_FIX;
                                                        break Label_0310;
                                                    }
                                                    if (liziz2 == 1) {
                                                        0k8 = X.0k8.GRID;
                                                        break Label_0310;
                                                    }
                                                    break Label_0306;
                                                }
                                                if (liziz2 == 1) {
                                                    0k8 = X.0k8.FLOATING;
                                                    break Label_0310;
                                                }
                                            }
                                        }
                                        0k8 = X.0k8.NORMAL;
                                    }
                                    if ((0k8 == X.0k8.GRID_FIX || 0k8 == X.0k8.GRID) && !0ta.LIZJ.LIZ(child2)) {
                                        layoutParams2.gravity = 49;
                                        layoutParams2.topMargin = 0cB.LIZ(78.0f);
                                    }
                                    else {
                                        layoutParams2.gravity = 17;
                                    }
                                    child2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                                }
                            }
                        }
                    }
                }
            }
            if (0ql.a.LJIIIIZZ) {
                0ql.LIZ.LIZ((View)this);
            }
            MethodCollector.o(9235);
            return;
        }
        final NullPointerException ex = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(9235);
        throw ex;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final DataChannel lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZIZ((Object)this);
        }
    }
    
    public final void setWindow(final Vvh lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
}
