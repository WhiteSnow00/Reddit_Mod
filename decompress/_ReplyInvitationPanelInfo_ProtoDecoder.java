// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import X.0Tb;
import java.util.HashMap;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _ReplyInvitationPanelInfo_ProtoDecoder implements 0TU<ReplyInvitationPanelInfo>
{
    static {
        Covode.recordClassIndex(9813);
    }
    
    public static ReplyInvitationPanelInfo LIZ(final 0Ta 0Ta) {
        final ReplyInvitationPanelInfo replyInvitationPanelInfo = new ReplyInvitationPanelInfo();
        replyInvitationPanelInfo.LJ = new HashMap<Long, String>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                0Ta.LIZ(liz);
                return replyInvitationPanelInfo;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz != 4) {
                            if (liziz != 6) {
                                0Tb.LIZJ(0Ta);
                            }
                            else {
                                final long liz2 = 0Ta.LIZ();
                                Long value = null;
                                String lizlll = null;
                                while (true) {
                                    final int liziz2 = 0Ta.LIZIZ();
                                    if (liziz2 == -1) {
                                        break;
                                    }
                                    if (liziz2 != 1) {
                                        if (liziz2 != 2) {
                                            continue;
                                        }
                                        lizlll = 0Ta.LIZLLL();
                                    }
                                    else {
                                        value = 0Tb.LIZIZ(0Ta);
                                    }
                                }
                                0Ta.LIZ(liz2);
                                if (value == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                if (lizlll == null) {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                                replyInvitationPanelInfo.LJ.put(value, lizlll);
                            }
                        }
                        else {
                            replyInvitationPanelInfo.LIZLLL = 0Ta.LIZLLL();
                        }
                    }
                    else {
                        replyInvitationPanelInfo.LIZJ = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZ(0Ta);
                    }
                }
                else {
                    replyInvitationPanelInfo.LIZIZ = 0Ta.LJ();
                }
            }
            else {
                replyInvitationPanelInfo.LIZ = 0Ta.LIZLLL();
            }
        }
    }
}
