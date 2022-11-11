// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;
import X.0cB;
import X.0jR;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import java.util.LinkedHashMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeShortPaySetting;
import kotlin.jvm.internal.n;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import java.util.Iterator;
import X.Goz;
import X.1F8;
import java.util.List;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.CTM;
import androidx.fragment.app.DialogFragment;
import X.Vqj;
import X.0AB;
import emotes.ui.EmotePreviewDialog;
import java.util.LinkedHashSet;
import com.bytedance.covode.number.Covode;
import X.0fs;
import java.util.Set;
import X.0ds;
import X.04v;

public class CommentService implements ICommentService
{
    public final 04v<0ds> commentConsumers;
    public final Set<0fs> commentEventListeners;
    
    static {
        Covode.recordClassIndex(4814);
    }
    
    public CommentService() {
        this.commentConsumers = new 04v<0ds>();
        this.commentEventListeners = new LinkedHashSet<0fs>();
    }
    
    public static void INVOKEVIRTUAL_com_bytedance_android_live_CommentService_com_ss_android_ugc_aweme_lancet_AlertLancet_show(final EmotePreviewDialog emotePreviewDialog, final 0AB 0ab, final String s) {
        Vqj.LIZ((DialogFragment)emotePreviewDialog, s);
        ((DialogFragment)emotePreviewDialog).show(0ab, s);
    }
    
    @Override
    public void addCommentEventListener(final 0fs 0fs) {
        CTM.LIZ((Object)0fs);
        this.commentEventListeners.add(0fs);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return (Class<? extends LiveRecyclableWidget>)CommentWidget.class;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getQuickCommentWidget() {
        return (Class<? extends LiveRecyclableWidget>)QuickCommentWidget.class;
    }
    
    @Override
    public List<1F8> loadAllBaseEmoji() {
        return Goz.LIZ().LIZIZ();
    }
    
    public final void notifyOnCommentSending() {
        final Iterator<Object> iterator = this.commentEventListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
    }
    
    @Override
    public void onInit() {
    }
    
    public final void registerCommentConsumer(final long n, final 0ds 0ds) {
        CTM.LIZ((Object)0ds);
        this.commentConsumers.LIZIZ(n, 0ds);
    }
    
    @Override
    public void removeCommentEventListener(final 0fs 0fs) {
        CTM.LIZ((Object)0fs);
        this.commentEventListeners.remove(0fs);
    }
    
    @Override
    public void sendComment(final long n, final String s, final int n2, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)s, (Object)sendCommentEvent$Sender);
        final 0ds 0ds = this.commentConsumers.LIZ(n, null);
        if (0ds != null) {
            0ds.LIZ(s, n2, sendCommentEvent$Sender);
        }
    }
    
    public void sendComment(final long n, final String s, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)s, (Object)sendCommentEvent$Sender);
        this.sendComment(n, s, 0, sendCommentEvent$Sender);
    }
    
    @Override
    public void sendComment(final long n, final List<? extends EmoteModel> list, final int n2, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)list, (Object)sendCommentEvent$Sender);
        final 0ds 0ds = this.commentConsumers.LIZ(n, null);
        if (0ds != null) {
            0ds.LIZ(list, sendCommentEvent$Sender);
        }
    }
    
    @Override
    public void showEmoteDetailDialog(final EmoteModel lizlll, final 0AB 0ab, final boolean b) {
        CTM.LIZ((Object)lizlll, (Object)0ab);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null && room.getOwner() != null) {
            final User owner = room.getOwner();
            n.LIZIZ((Object)owner, "");
            if (owner.isAnchorHasSubQualification()) {
                if (SubscribeShortPaySetting.INSTANCE.getValue()) {
                    final User owner2 = room.getOwner();
                    n.LIZIZ((Object)owner2, "");
                    if (!owner2.isSubscribed() && !b) {
                        final String anchor_user_badge_or_emotes_subscribe = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_badge_or_emotes_subscribe();
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("page_type", "emotes");
                        final ISubscribeService subscribeService = 0jR.LIZ(ISubscribeService.class);
                        final Context lj = 0cB.LJ();
                        n.LIZIZ((Object)lj, "");
                        subscribeService.openLiveRoomSubscribeLynx(lj, room, anchor_user_badge_or_emotes_subscribe, "emote_preview", (Map)linkedHashMap);
                        return;
                    }
                }
                final EmotePreviewDialog emotePreviewDialog = new EmotePreviewDialog();
                if (lizlll != null) {
                    emotePreviewDialog.LIZLLL = lizlll;
                }
                INVOKEVIRTUAL_com_bytedance_android_live_CommentService_com_ss_android_ugc_aweme_lancet_AlertLancet_show(emotePreviewDialog, 0ab, EmotePreviewDialog.class.getSimpleName());
            }
        }
    }
    
    public final void unregisterCommentConsumer(final long n) {
        this.commentConsumers.LIZIZ(n);
    }
}
