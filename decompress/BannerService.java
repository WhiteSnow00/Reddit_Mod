// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.banner;

import java.util.Iterator;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import X.G69;
import X.HDi;
import X.H31;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.0CC;
import X.0CG;
import java.lang.ref.WeakReference;
import X.0VT;
import android.os.SystemClock;
import X.0CH;
import X.HDh;
import X.GwN;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import X.FIV;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.S4L;
import java.util.List;
import X.CTM;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.util.LongSparseArray;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public class BannerService implements IBannerService, OnMessageListener
{
    public final LongSparseArray<DataChannel> mDataChannels;
    public final LongSparseArray<ArrayList<a>> mOnBannerVisibilityChangeListeners;
    
    static {
        Covode.recordClassIndex(4891);
    }
    
    public BannerService() {
        this.mOnBannerVisibilityChangeListeners = (LongSparseArray<ArrayList<a>>)new LongSparseArray();
        this.mDataChannels = (LongSparseArray<DataChannel>)new LongSparseArray();
    }
    
    public void addOnBannerVisibilityChangeListener(final long n, final a a) {
        CTM.LIZ((Object)a);
        List list;
        if ((list = (List)this.mOnBannerVisibilityChangeListeners.get(n)) == null) {
            list = new ArrayList();
            this.mOnBannerVisibilityChangeListeners.put(n, (Object)list);
        }
        list.add(a);
    }
    
    @Override
    public S4L<? extends LiveWidget> broadcastPreviewBannerWidget() {
        return (S4L<? extends LiveWidget>)FIV.LIZ.LIZ((Class)BroadcastPreviewBannerWidget.class);
    }
    
    @Override
    public LiveWidget createLiveGoalsWidget() {
        return (LiveWidget)new LiveGoalsWidget();
    }
    
    @Override
    public void enter(final DataChannel dataChannel, final Room room) {
        if (room != null) {
            this.mDataChannels.put(room.getId(), (Object)dataChannel);
        }
        if (dataChannel != null) {
            final IMessageManager messageManager = (IMessageManager)dataChannel.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.addMessageListener(HDh.ROOM_VERIFY.getIntType(), (OnMessageListener)this);
            }
        }
    }
    
    @Override
    public void fetchBanner(0CH 0ch, final long liziz, final boolean lizj) {
        0VT.LIZJ = SystemClock.elapsedRealtime();
        final InRoomBannerManager lj = InRoomBannerManager.LJ;
        0ch = (InRoomBannerManager.LIZ = new WeakReference<0CH>(0ch)).get();
        if (0ch != null) {
            final 0CC lifecycle = 0ch.getLifecycle();
            if (lifecycle != null) {
                lifecycle.LIZ((0CG)lj);
            }
        }
        InRoomBannerManager.LIZIZ = liziz;
        InRoomBannerManager.LIZJ = lizj;
        lj.LIZ(InRoomBannerManager.LIZIZ, InRoomBannerManager.LIZJ);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return (Class<? extends LiveRecyclableWidget>)TopRightBannerWidget.class;
    }
    
    @Override
    public void leave(final DataChannel dataChannel, final Room room) {
        if (room != null) {
            this.mDataChannels.remove(room.getId());
            this.mOnBannerVisibilityChangeListeners.remove(room.getId());
        }
        if (dataChannel != null) {
            final IMessageManager messageManager = (IMessageManager)dataChannel.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.removeMessageListener(HDh.ROOM_VERIFY.getIntType(), (OnMessageListener)this);
            }
        }
    }
    
    public void onInit() {
    }
    
    public void onMessage(final IMessage message) {
        Object o;
        if (!(message instanceof H31)) {
            o = null;
        }
        else {
            o = message;
        }
        final HDi hDi = (HDi)o;
        if (hDi != null) {
            final CommonMessageData baseMessage = hDi.baseMessage;
            if (baseMessage != null) {
                final long lizj = baseMessage.LIZJ;
                final DataChannel dataChannel = (DataChannel)this.mDataChannels.get(lizj);
                if (dataChannel != null) {
                    final Room room = (Room)dataChannel.LIZIZ((Class)G69.class);
                    if (room != null && message instanceof RoomVerifyMessage) {
                        final RoomVerifyMessage roomVerifyMessage = (RoomVerifyMessage)message;
                        if (roomVerifyMessage.LIZ == 25) {
                            final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                            if (roomAuthStatus != null) {
                                roomAuthStatus.setBannerState(1);
                            }
                            final ArrayList list = (ArrayList)this.mOnBannerVisibilityChangeListeners.get(lizj);
                            if (list != null) {
                                for (final a a : list) {
                                    this.shouldShowBanner(room);
                                    a.LIZ();
                                }
                            }
                            return;
                        }
                        if (roomVerifyMessage.LIZ == 24) {
                            final RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                            if (roomAuthStatus2 != null) {
                                roomAuthStatus2.setBannerState(2);
                            }
                            final ArrayList list2 = (ArrayList)this.mOnBannerVisibilityChangeListeners.get(lizj);
                            if (list2 != null) {
                                for (final a a2 : list2) {
                                    this.shouldShowBanner(room);
                                    a2.LIZ();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean shouldShowBanner(final long n) {
        final DataChannel dataChannel = (DataChannel)this.mDataChannels.get(n);
        Room room;
        if (dataChannel != null) {
            room = (Room)dataChannel.LIZIZ((Class)G69.class);
        }
        else {
            room = null;
        }
        return this.shouldShowBanner(room);
    }
    
    public boolean shouldShowBanner(final Room room) {
        if (room == null) {
            return false;
        }
        final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        return roomAuthStatus == null || roomAuthStatus.getBannerState() != 2;
    }
}
