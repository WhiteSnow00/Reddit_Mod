// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.roomcomponents;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class OnlineRankConfig extends 9Mp
{
    @c(LIZ = "avatar_count")
    public int avatarNumber;
    @c(LIZ = "show_avatar_list")
    public boolean avatarShow;
    @c(LIZ = "can_panel_click")
    public boolean onlinePanelClick;
    @c(LIZ = "show_online_panel")
    public boolean onlinePanelShow;
    @c(LIZ = "show_score")
    public boolean scoreShow;
    
    static {
        Covode.recordClassIndex(4955);
    }
    
    public OnlineRankConfig() {
        this(false, false, false, 0, false, 31, null);
    }
    
    public OnlineRankConfig(final boolean onlinePanelShow, final boolean onlinePanelClick, final boolean avatarShow, final int avatarNumber, final boolean scoreShow) {
        this.onlinePanelShow = onlinePanelShow;
        this.onlinePanelClick = onlinePanelClick;
        this.avatarShow = avatarShow;
        this.avatarNumber = avatarNumber;
        this.scoreShow = scoreShow;
    }
    
    public static int INVOKESTATIC_com_bytedance_android_live_base_model_roomcomponents_OnlineRankConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(final int n) {
        return n;
    }
    
    public final boolean component1() {
        return this.onlinePanelShow;
    }
    
    public final boolean component2() {
        return this.onlinePanelClick;
    }
    
    public final boolean component3() {
        return this.avatarShow;
    }
    
    public final int component4() {
        return this.avatarNumber;
    }
    
    public final boolean component5() {
        return this.scoreShow;
    }
    
    public final OnlineRankConfig copy(final boolean b, final boolean b2, final boolean b3, final int n, final boolean b4) {
        return new OnlineRankConfig(b, b2, b3, n, b4);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.onlinePanelShow, this.onlinePanelClick, this.avatarShow, this.avatarNumber, this.scoreShow };
    }
}
