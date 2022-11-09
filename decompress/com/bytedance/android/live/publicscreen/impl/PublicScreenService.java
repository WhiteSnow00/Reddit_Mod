// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl;

import X.HDi;
import X.GK2;
import X.4Uh;
import X.2fc;
import X.GIK;
import X.2d6;
import X.1dt;
import X.1ds;
import X.FCD;
import X.FC5;
import com.google.gson.Gson;
import X.0yr;
import com.bytedance.android.live.pin.api.PinApi;
import X.0ba;
import X.Fk2;
import X.10h;
import X.H52;
import X.0TH;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import X.6uH;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import X.Got;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.Objects;
import X.0jR;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import X.10r;
import X.10q;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import kotlin.jvm.internal.n;
import X.GpY;
import X.10d;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import X.10I;
import X.10J;
import X.H7p;
import android.widget.TextView;
import X.GpZ;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenRadioFilterWidget;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenMultiFilterWidget;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenFilterWidget;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenWidget;
import java.util.Iterator;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.10p;
import com.bytedance.android.livesdkapi.depend.model.live.PinInfo;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import X.HDh;
import X.GwN;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import X.1dq;
import X.29e;
import X.G8I;
import X.29d;
import X.Gci;
import X.29c;
import X.G7X;
import X.29b;
import X.G6B;
import X.29m;
import X.G8F;
import X.29l;
import X.Gcn;
import X.29k;
import X.Gco;
import X.29j;
import X.G63;
import X.29i;
import X.2Du;
import X.29h;
import X.G68;
import X.29g;
import X.2EV;
import X.29f;
import X.2E8;
import X.SRS;
import X.29a;
import X.2EY;
import X.0zY;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.0CH;
import X.HBZ;
import X.10E;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.10D;
import X.10H;
import android.content.Context;
import X.2Gk;
import X.11M;
import X.1eV;
import X.10s;
import X.CTM;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import X.1ea;
import X.HCX;
import X.HCR;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import X.10o;
import X.10i;
import X.H31;
import java.util.Map;
import android.util.LongSparseArray;
import X.0zk;
import java.util.List;
import android.util.SparseArray;
import X.1eY;
import X.10m;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;

public class PublicScreenService implements IPublicScreenService, 10m
{
    public 1eY autoTranslatePresenter;
    public final SparseArray<List<0zk>> capsuleHandlerMap;
    public final LongSparseArray<Long> hotDurations;
    public final Map<Class<? extends H31>, 10i<? extends H31>> mConverters;
    public final List<10o> onRegistryReadyListeners;
    public LongSparseArray<BottomMessage> pendingBottomMessages;
    public final LongSparseArray<List<HCR<? extends HCX>>> presenters;
    public final LongSparseArray<Long> startStreamingTimestamps;
    public final 1ea textMessageConfig;
    public final List<10o> unmodifiableOnRegistryReadyListeners;
    
    static {
        Covode.recordClassIndex(10752);
    }
    
    public PublicScreenService() {
        final ArrayList onRegistryReadyListeners = new ArrayList();
        this.onRegistryReadyListeners = onRegistryReadyListeners;
        this.unmodifiableOnRegistryReadyListeners = (List<10o>)Collections.unmodifiableList((List<?>)onRegistryReadyListeners);
        this.presenters = (LongSparseArray<List<HCR<? extends HCX>>>)new LongSparseArray();
        this.textMessageConfig = new 1ea();
        this.hotDurations = (LongSparseArray<Long>)new LongSparseArray();
        this.startStreamingTimestamps = (LongSparseArray<Long>)new LongSparseArray();
        this.pendingBottomMessages = (LongSparseArray<BottomMessage>)new LongSparseArray();
        this.capsuleHandlerMap = (SparseArray<List<0zk>>)new SparseArray();
        this.mConverters = new LinkedHashMap<Class<? extends H31>, 10i<? extends H31>>();
    }
    
    @Override
    public void addCapsuleHandler(final int n, final 0zk 0zk) {
        List list;
        if ((list = (List)this.capsuleHandlerMap.get(n)) == null) {
            list = new ArrayList();
            this.capsuleHandlerMap.put(n, (Object)list);
        }
        if (0zk != null && (list.contains(0zk) ^ true)) {
            list.add(0zk);
        }
    }
    
    public final void addHotDuration(final long n, final long n2) {
        final Long n3 = (Long)this.hotDurations.get(n);
        long longValue;
        if (n3 != null) {
            longValue = n3;
        }
        else {
            longValue = 0L;
        }
        this.hotDurations.put(n, (Object)(longValue + n2));
    }
    
    @Override
    public void addOnRegistryReadyListener(final 10o 10o) {
        CTM.LIZ((Object)10o);
        this.onRegistryReadyListeners.add(10o);
        10o.LIZ(this);
    }
    
    @Override
    public void clearMockChatMessage() {
        10s.LIZ.clear();
    }
    
    @Override
    public 1eV convert(final H31 h31) {
        if (h31 == null) {
            return null;
        }
        final 2Gk<? extends H31> liz = 11M.LIZ(h31);
        if (liz != null) {
            return liz;
        }
        10i value;
        if (!((value = this.mConverters.get(h31.getClass())) instanceof 10i)) {
            value = null;
        }
        final 10i 10i = value;
        if (10i != null) {
            return 10i.LIZ(h31);
        }
        return null;
    }
    
    @Override
    public 10E createGameMessageView(final Context context, final int n, final 10H 10H, final 10D 10D, final DataChannel dataChannel) {
        CTM.LIZ((Object)context, (Object)10D, (Object)dataChannel);
        return (10E)new HBZ(context, n, 10H, 10D, dataChannel);
    }
    
    @Override
    public void enter(final 0CH 0ch, final DataChannel liz, final Room room) {
        CTM.LIZ((Object)0ch);
        if (liz == null) {
            return;
        }
        if (room == null) {
            return;
        }
        CTM.LIZ((Object)0ch, (Object)room, (Object)liz);
        0zY.LIZ.put(room.getId(), (Object)liz);
        final PinInfo pinInfo = room.getPinInfo();
        if ((pinInfo != null && !pinInfo.pinEnabled) || room.isThirdParty || room.isScreenshot) {
            0zY.LIZIZ.put(room.getId(), (Object)1);
        }
        else {
            0zY.LIZIZ.put(room.getId(), (Object)0);
            liz.LIZIZ(0ch, (Class)2EY.class, (SRS)new 29a(room));
            liz.LIZIZ(0ch, (Class)2E8.class, (SRS)new 29f(room));
            liz.LIZIZ(0ch, (Class)2EV.class, (SRS)new 29g(room));
            liz.LIZIZ(0ch, (Class)G68.class, (SRS)new 29h(room));
            liz.LIZIZ(0ch, (Class)2Du.class, (SRS)new 29i(room));
            liz.LIZIZ(0ch, (Class)G63.class, (SRS)new 29j(room));
            liz.LIZIZ(0ch, (Class)Gco.class, (SRS)new 29k(room));
            liz.LIZIZ(0ch, (Class)Gcn.class, (SRS)new 29l(room));
            liz.LIZIZ(0ch, (Class)G8F.class, (SRS)new 29m(room));
            liz.LIZIZ(0ch, (Class)G6B.class, (SRS)new 29b(room));
            liz.LIZIZ(0ch, (Class)G7X.class, (SRS)new 29c(room));
            liz.LIZIZ(0ch, (Class)Gci.class, (SRS)new 29d(room));
            liz.LIZIZ(0ch, (Class)G8I.class, (SRS)new 29e(room));
        }
        final 1dq 1dq = new 1dq(room);
        0zY.LJFF.put(room.getId(), (Object)1dq);
        final IMessageManager messageManager = (IMessageManager)liz.LIZIZ((Class)GwN.class);
        if (messageManager != null) {
            messageManager.addMessageListener(HDh.PIN_MESSAGE.getIntType(), (OnMessageListener)1dq);
        }
        final 1eY autoTranslatePresenter = new 1eY();
        this.autoTranslatePresenter = autoTranslatePresenter;
        autoTranslatePresenter.LIZ = liz;
    }
    
    @Override
    public 10p getAutoTranslatePresenter() {
        return this.autoTranslatePresenter;
    }
    
    @Override
    public List<0zk> getCapsuleHandlers(final int n) {
        final List list = (List)this.capsuleHandlerMap.get(n);
        if (list != null) {
            return (List<0zk>)Collections.unmodifiableList((List<?>)list);
        }
        return null;
    }
    
    public Class<? extends LiveRecyclableWidget> getCommitPinWidget() {
        return MainScreenCommentPinnedWidget.class;
    }
    
    @Override
    public BottomMessage getCurrentBottomMessage(final long n) {
        final List list = (List)this.presenters.get(n);
        if (list != null) {
            for (final HCR hcr : list) {
                if (!hcr.LJII()) {
                    return hcr.LJII;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class<? extends IPublicScreenWidget> getExtendedPublicScreenWidget() {
        return (Class<? extends IPublicScreenWidget>)ExtendedPublicScreenWidget.class;
    }
    
    public Class<? extends LiveRecyclableWidget> getExtendedScreenFilterWidget() {
        return (Class<? extends LiveRecyclableWidget>)ExtendedScreenFilterWidget.class;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getExtendedScreenMultiFilterWidget() {
        return ExtendedScreenMultiFilterWidget.class;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getExtendedScreenRadioFilterWidget() {
        return ExtendedScreenRadioFilterWidget.class;
    }
    
    @Override
    public 10H getGiftHistoryManager(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        return (10H)new GpZ(dataChannel);
    }
    
    @Override
    public 10I getGiftHistoryWidgetHelper(final 0CH 0ch, final DataChannel dataChannel, final TextView textView, final H7p h7p, final int n, final int n2, final 10J 10J) {
        CTM.LIZ((Object)0ch, (Object)dataChannel, (Object)textView, (Object)h7p, (Object)10J);
        return (10I)new GiftHistoryWidgetHelper(0ch, dataChannel, textView, h7p, n, n2, 10J);
    }
    
    @Override
    public long getHotDuration(final long n) {
        final Long n2 = (Long)this.hotDurations.get(n);
        if (n2 != null) {
            return n2;
        }
        return 0L;
    }
    
    @Override
    public 10d getNewMessageListener(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        return (10d)new GpY(dataChannel);
    }
    
    @Override
    public List<10o> getOnRegistryReadyListeners() {
        final List<10o> unmodifiableOnRegistryReadyListeners = this.unmodifiableOnRegistryReadyListeners;
        n.LIZIZ((Object)unmodifiableOnRegistryReadyListeners, "");
        return unmodifiableOnRegistryReadyListeners;
    }
    
    public final BottomMessage getPendingBottomMessage(final long n) {
        final BottomMessage bottomMessage = (BottomMessage)this.pendingBottomMessages.get(n);
        this.pendingBottomMessages.remove(n);
        return bottomMessage;
    }
    
    @Override
    public Class<? extends IPublicScreenWidget> getPublicScreenWidgetClass(final boolean b) {
        if (b) {
            return (Class<? extends IPublicScreenWidget>)PortraitPublicScreenWidget.class;
        }
        return (Class<? extends IPublicScreenWidget>)LandscapePublicScreenWidget.class;
    }
    
    @Override
    public Long getStartStreamingTimestamp(final long n) {
        return (Long)this.startStreamingTimestamps.get(n);
    }
    
    @Override
    public void handleCapsuleClick(final 10r 10r, final CapsuleMessage capsuleMessage) {
        CTM.LIZ((Object)10r, (Object)capsuleMessage);
        0jR.LIZ(IActionHandlerService.class).handle(10r.LJIIIZ, capsuleMessage.LIZLLL);
    }
    
    @Override
    public void hideBottomMessage(final long n, final String s) {
        CTM.LIZ((Object)s);
        final List list = (List)this.presenters.get(n);
        if (list != null) {
            for (final HCR hcr : list) {
                if ("".equals(s) || (hcr.LJII != null && hcr.LJII.LJI != null && Objects.equals(hcr.LJII.LJI.LIZJ, s))) {
                    hcr.LJII = null;
                    ((HCX)((GK2)hcr).LJJIL).LJII();
                }
            }
        }
    }
    
    @Override
    public void insertBottomMessage(final long lizj, final String liz, final Text ljiiiz, final long lizlll, final PunishEventInfo lji, int liziz, final int lizj2, final int lj, final int ljii, final String ljiiiizz) {
        final BottomMessage bottomMessage = new BottomMessage();
        final long lizlll2 = -System.currentTimeMillis();
        final CommonMessageData baseMessage = new CommonMessageData();
        baseMessage.LIZJ = lizj;
        baseMessage.LIZLLL = lizlll2;
        final int n = 1;
        baseMessage.LJI = true;
        baseMessage.LJIIIZ = ljiiiz;
        ((HDi)bottomMessage).baseMessage = baseMessage;
        bottomMessage.LIZ = liz;
        bottomMessage.LIZLLL = lizlll;
        bottomMessage.LIZIZ = liziz;
        bottomMessage.LIZJ = lizj2;
        bottomMessage.LJ = lj;
        bottomMessage.LJI = lji;
        bottomMessage.LJII = ljii;
        bottomMessage.LJIIIIZZ = ljiiiizz;
        final List list = (List)this.presenters.get(lizj);
        if (list != null) {
            final Iterator iterator = list.iterator();
            liziz = n;
            while (iterator.hasNext()) {
                final HCR hcr = (HCR)iterator.next();
                if (!hcr.LJII()) {
                    hcr.LIZ(bottomMessage);
                    liziz = 0;
                }
            }
            if (liziz == 0) {
                return;
            }
        }
        this.pendingBottomMessages.put(lizj, (Object)bottomMessage);
    }
    
    @Override
    public long insertMessage(long liz, final H31 h31, final boolean b) {
        CTM.LIZ((Object)h31);
        final List list = (List)this.presenters.get(liz);
        final long n = liz = 0L;
        if (list != null) {
            final Iterator iterator = list.iterator();
            liz = n;
            while (iterator.hasNext()) {
                liz = ((HCR)iterator.next()).LIZ(h31, b);
            }
        }
        return liz;
    }
    
    public long insertModel(final long n, final 1eV 1eV) {
        CTM.LIZ((Object)1eV);
        return this.insertModel(n, 1eV, false);
    }
    
    @Override
    public long insertModel(long liz, final 1eV 1eV, final boolean b) {
        CTM.LIZ((Object)1eV);
        final List list = (List)this.presenters.get(liz);
        long n;
        liz = (n = 0L);
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (true) {
                n = liz;
                if (!iterator.hasNext()) {
                    break;
                }
                liz = ((HCR)iterator.next()).LIZ(b, 1eV);
            }
        }
        return n;
    }
    
    @Override
    public void leave(final DataChannel dataChannel, final Room room) {
        final 0zY ljii = 0zY.LJII;
        long id;
        if (room != null) {
            id = room.getId();
        }
        else {
            id = 0L;
        }
        final DataChannel dataChannel2 = (DataChannel)0zY.LIZ.get(id);
        if (dataChannel2 != null) {
            final IMessageManager messageManager = (IMessageManager)dataChannel2.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.removeMessageListener((OnMessageListener)0zY.LJFF.get(id));
            }
        }
        0zY.LIZ(ljii, id);
        0zY.LJFF.remove(id);
        0zY.LIZ.remove(id);
        0zY.LIZIZ.remove(id);
        0zY.LIZLLL.remove(id);
        this.autoTranslatePresenter = null;
    }
    
    @Override
    public ChatMessage mockChatMessage(final long lizj, final String liziz, final User lizj2, final int lji, final Got got) {
        final ChatMessage chatMessage = new ChatMessage();
        final long n = -System.currentTimeMillis();
        10s.LIZ.add(n);
        chatMessage.LIZ = n;
        chatMessage.LJIIIZ = String.valueOf(n);
        final CommonMessageData baseMessage = new CommonMessageData();
        baseMessage.LIZJ = lizj;
        baseMessage.LIZLLL = n;
        baseMessage.LJI = true;
        ((HDi)chatMessage).baseMessage = baseMessage;
        chatMessage.LIZIZ = liziz;
        chatMessage.LJI = lji;
        chatMessage.LIZJ = lizj2;
        final User lizj3 = chatMessage.LIZJ;
        kotlin.jvm.internal.n.LIZIZ((Object)lizj3, "");
        lizj3.setBadgeList((List<BadgeStruct>)6uH.INSTANCE);
        List liziz2;
        if (got != null) {
            liziz2 = got.LIZIZ;
        }
        else {
            liziz2 = null;
        }
        chatMessage.LJIILJJIL = liziz2;
        return chatMessage;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onPlayFragmentCreate() {
        0TH.LJFF.LIZ(2131562300, 3);
        0TH.LJFF.LIZ(2131562301, 3);
        0TH.LJFF.LIZ(2131562298, 4);
        H52.LJI.LIZ(2131560560, 7, 0);
    }
    
    @Override
    public void onStartStreaming(final long n) {
        this.startStreamingTimestamps.put(n, (Object)System.currentTimeMillis());
    }
    
    @Override
    public void onStopStreaming(final long n) {
        this.startStreamingTimestamps.remove(n);
    }
    
    @Override
    public void pin(final long n, final H31 ljff) {
        CTM.LIZ((Object)ljff);
        CTM.LIZ((Object)ljff);
        final 10h 10h = new 10h(n);
        10h.LIZJ = true;
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        10h.LIZIZ = liziz.LIZIZ();
        10h.LJFF = ljff;
        0zY.LIZJ.put(n, (Object)10h);
        0ba.LIZJ("under review + ".concat(String.valueOf(10h)));
        final List list = (List)0zY.LIZLLL.get(10h.LIZ);
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((0zY.a)iterator.next()).LIZ(10h);
            }
        }
        final PinApi pinApi = 0yr.LIZ().LIZ(PinApi.class);
        final HDh messageType = ((HDi)ljff).getMessageType();
        n.LIZIZ((Object)messageType, "");
        final String wsMethod = messageType.getWsMethod();
        n.LIZIZ((Object)wsMethod, "");
        final String liziz2 = ((Gson)0zY.LJI.getValue()).LIZIZ((Object)ljff);
        n.LIZIZ((Object)liziz2, "");
        final 2fc liz = pinApi.pin(n, wsMethod, liziz2).LIZ((FCD)new FC5()).LIZ((2d6)new 1ds(10h, n), (2d6)new 1dt(n, 10h));
        List list2;
        if ((list2 = (List)0zY.LJ.get(n)) == null) {
            list2 = new ArrayList();
            0zY.LJ.put(n, (Object)list2);
        }
        n.LIZIZ((Object)liz, "");
        list2.add(liz);
    }
    
    @Override
    public void preloadBroadcastLayout() {
        0TH.LJFF.LIZ(2131562300, 2);
        0TH.LJFF.LIZ(2131562301, 2);
        H52.LJI.LIZ(2131560560, 2, 0);
    }
    
    @Override
    public <MESSAGE extends H31> void registerModelConverter(final Class<MESSAGE> clazz, final 10i<MESSAGE> 10i) {
        CTM.LIZ((Object)clazz, (Object)10i);
        this.mConverters.put(clazz, 10i);
    }
    
    public final void registerPresenter(final long n, final HCR<? extends HCX> hcr) {
        CTM.LIZ((Object)hcr);
        List list;
        if ((list = (List)this.presenters.get(n)) == null) {
            list = new ArrayList();
        }
        if (!list.contains(hcr)) {
            list.add(hcr);
        }
        this.presenters.put(n, (Object)list);
    }
    
    @Override
    public void removeModelByToken(final long n, final long n2) {
        final List list = (List)this.presenters.get(n);
        if (list != null) {
            for (final HCR hcr : list) {
                if (n2 != 0L) {
                    final int liz = hcr.LIZ(n2);
                    if (liz != -1) {
                        hcr.LIZIZ(liz);
                    }
                    else {
                        if (HCR.LIZ(n2, hcr.LJIILL) || HCR.LIZ(n2, hcr.LJIILLIIL)) {
                            continue;
                        }
                        HCR.LIZ(n2, hcr.LJIIZILJ);
                    }
                }
            }
        }
    }
    
    public void removeOnRegistryReadyListener(final 10o 10o) {
        CTM.LIZ((Object)10o);
        this.onRegistryReadyListeners.remove(10o);
    }
    
    @Override
    public void resetDuration(final long n) {
        this.hotDurations.remove(n);
    }
    
    @Override
    public boolean textDropShadow(final boolean b) {
        return b;
    }
    
    public final void unregisterPresenter(final long n) {
        this.presenters.remove(n);
    }
    
    @Override
    public void updateGameMessageLikeCount(final String s) {
        CTM.LIZ((Object)s);
        CTM.LIZ((Object)s);
        HBZ.LJIILL.onNext((Object)s);
    }
    
    @Override
    public void updateGameMessageViewUserCount(final int n) {
        HBZ.LJIILJJIL.onNext((Object)n);
        4Uh.LJII.onNext((Object)n);
    }
    
    @Override
    public void updateMessage(final long n, final long n2, final H31 h31) {
        CTM.LIZ((Object)h31);
        final List list = (List)this.presenters.get(n);
        if (list != null) {
            for (final HCR hcr : list) {
                if (n2 != 0L) {
                    if (h31 == null) {
                        continue;
                    }
                    final 1eV liz = hcr.LIZ(h31);
                    if (liz == null) {
                        continue;
                    }
                    final int liz2 = hcr.LIZ(n2);
                    if (liz2 == -1) {
                        continue;
                    }
                    hcr.LIZ(liz2, liz);
                }
            }
        }
    }
    
    @Override
    public void updateModel(final long n, final 1eV 1eV) {
        CTM.LIZ((Object)1eV);
        final List list = (List)this.presenters.get(n);
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((HCR)iterator.next()).LJFF(1eV);
            }
        }
    }
}
