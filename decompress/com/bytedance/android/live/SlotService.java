// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlotExperiment;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import android.text.TextUtils;
import X.GlG;
import java.util.Collection;
import X.0ba;
import X.EjR;
import X.Hki;
import java.util.ArrayList;
import X.K47;
import java.util.List;
import com.bytedance.android.live.slot.FreeFrameSlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import X.GTi;
import android.graphics.Rect;
import X.Eel;
import android.content.Context;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.EgC;
import X.Ei7;
import java.util.Iterator;
import X.0jJ;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.android.live.slot.IconSlotController;
import X.HjK;
import X.Hjq;
import X.EiA;
import X.Hjx;
import X.1nL;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.util.Map;
import com.bytedance.android.live.slot.ISlotService;

public class SlotService implements ISlotService
{
    public final Map<Long, View> rootViewMap;
    
    static {
        Covode.recordClassIndex(4817);
    }
    
    public SlotService() {
        this.rootViewMap = new HashMap<Long, View>();
    }
    
    public HjK createIconSlotController(final 1nL 1nL, final Hjx hjx, final EiA eiA, final Hjq hjq) {
        return (HjK)new IconSlotController(1nL, hjx, eiA, hjq);
    }
    
    public void dispatchMessage(final IMessage message) {
        for (Ei7 ei7 : 0jJ.LIZ().LIZ.LIZLLL.values()) {}
    }
    
    public EgC getAggregateProviderByID(final EiA eiA) {
        return 0jJ.LIZ().LIZIZ(eiA);
    }
    
    public Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return (Class<? extends LiveRecyclableWidget>)SlotBarrageWidget.class;
    }
    
    public Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return (Class<? extends LiveRecyclableWidget>)BottomLeftSlotWidget.class;
    }
    
    public Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return (Class<? extends LiveRecyclableWidget>)FrameL2SlotWidget.class;
    }
    
    public Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return (Class<? extends LiveRecyclableWidget>)FrameL3SlotWidget.class;
    }
    
    public Rect getFrameSlotLocation(final Context context, final Eel eel) {
        final 1nL liz = GTi.LIZ(context);
        if (liz != null) {
            final int n = SlotService$1.LIZIZ[eel.ordinal()];
            View view;
            if (n != 1) {
                if (n != 2 && n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            return null;
                        }
                        view = liz.findViewById(2131365565);
                    }
                    else {
                        view = liz.findViewById(2131362953);
                    }
                }
                else {
                    view = liz.findViewById(2131365546);
                }
            }
            else {
                view = liz.findViewById(2131371443);
            }
            if (view != null) {
                final int[] array = new int[2];
                view.getLocationInWindow(array);
                return new Rect(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
            }
        }
        return null;
    }
    
    public Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return (Class<? extends LiveRecyclableWidget>)FrameSlotWidget.class;
    }
    
    public Class<? extends LiveRecyclableWidget> getFreeFrameSlotWidget() {
        return (Class<? extends LiveRecyclableWidget>)FreeFrameSlotWidget.class;
    }
    
    public Rect getIconSlotLocation(final Context context, final EiA eiA) {
        final 1nL liz = GTi.LIZ(context);
        if (liz != null) {
            final int n = SlotService$1.LIZ[eiA.ordinal()];
            View view;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return null;
                    }
                    view = liz.findViewById(2131372781);
                }
                else {
                    view = liz.findViewById(2131362931);
                }
            }
            else {
                view = liz.findViewById(2131372783);
            }
            if (view != null) {
                final int[] array = new int[2];
                view.getLocationInWindow(array);
                return new Rect(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
            }
        }
        return null;
    }
    
    public List<K47> getLiveShareSheetAction(final Map<String, Object> map, final EiA eiA) {
        final ArrayList list = new ArrayList();
        final List<Hki> liz = 0jJ.LIZ().LIZ(eiA);
        if (liz == null) {
            return list;
        }
        for (final Hki hki : liz) {
            final boolean b = hki.LIZ instanceof EjR;
            final List list2 = null;
            EjR ejR;
            if (b) {
                ejR = (EjR)hki.LIZ;
            }
            else {
                ejR = null;
            }
            if (ejR != null) {
                final Map liz2 = ejR.LIZ((Map)map, eiA);
                List list3;
                try {
                    list3 = liz2.get("param_live_broadcast_share_sheet_list");
                }
                catch (final Exception ex) {
                    0ba.LIZ(4, "TAG", "getLiveShareSheetAction responseParams get param_live_broadcast_share_sheet_list, error");
                    list3 = list2;
                }
                if (list3 == null || list3.size() <= 0) {
                    continue;
                }
                list.addAll(list3);
            }
        }
        return list;
    }
    
    public List<Hki> getProviderWrappersByID(final Eel eel) {
        return 0jJ.LIZ().LIZ(eel);
    }
    
    public List<Hki> getProviderWrappersByID(final EiA eiA) {
        return 0jJ.LIZ().LIZ(eiA);
    }
    
    public GlG getSlotMessagerByBiz(final String s) {
        final 0jJ liz = 0jJ.LIZ();
        if (liz.LIZ.LIZLLL.containsKey(s) && liz.LIZ.LIZ(s) != null) {
            liz.LIZ.LIZ(s);
        }
        return null;
    }
    
    public boolean isBizTypeRegistered(final String s) {
        return 0jJ.LIZ().LIZ.LIZLLL.containsKey(s);
    }
    
    public void onInit() {
    }
    
    public void registerAggregateSlot(final EgC egC) {
        final 0jJ liz = 0jJ.LIZ();
        final String liziz = egC.LIZIZ();
        if (!TextUtils.isEmpty((CharSequence)liziz)) {
            final SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(liziz);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                liz.LIZ.LJ.put(egC.LIZIZ(), egC);
                final List liz2 = egC.LIZ();
                if (liz2 != null) {
                    for (final EiA eiA : liz2) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(eiA.name())) {
                            liz.LIZ.LIZJ.put(eiA, egC);
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }
    
    public void registerSlot(final Ei7 ei7) {
        final 0jJ liz = 0jJ.LIZ();
        final String lizj = ei7.LIZJ();
        if (!TextUtils.isEmpty((CharSequence)lizj)) {
            final SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(lizj);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                liz.LIZ.LIZLLL.put(ei7.LIZJ(), ei7);
                final List liz2 = ei7.LIZ();
                if (liz2 != null) {
                    for (final EiA eiA : liz2) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(eiA.name())) {
                            final 0jJ.a liz3 = liz.LIZ;
                            List list;
                            if ((list = liz3.LIZ.get(eiA)) == null) {
                                list = new ArrayList();
                                liz3.LIZ.put(eiA, list);
                            }
                            list.add(ei7);
                        }
                    }
                }
                final List liziz = ei7.LIZIZ();
                if (liziz != null) {
                    for (final Eel eel : liziz) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getFrameSlotDisallowList() == null || !slotBizTypeDisallow.getFrameSlotDisallowList().contains(eel.name())) {
                            final 0jJ.a liz4 = liz.LIZ;
                            List list2;
                            if ((list2 = liz4.LIZIZ.get(eel)) == null) {
                                list2 = new ArrayList();
                                liz4.LIZIZ.put(eel, list2);
                            }
                            list2.add(ei7);
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }
}
