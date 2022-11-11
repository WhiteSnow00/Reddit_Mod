// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import X.0Tb;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import java.util.HashMap;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _BattleFinishResult_ResponseData_ProtoDecoder implements 0TU<BattleFinishResult.ResponseData>
{
    static {
        Covode.recordClassIndex(7890);
    }
    
    public static BattleFinishResult.ResponseData LIZ(final 0Ta 0Ta) {
        final BattleFinishResult.ResponseData responseData = new BattleFinishResult.ResponseData();
        responseData.LIZIZ = new HashMap<Long, BattleUserArmies>();
        responseData.LIZJ = new HashMap<Long, BattleUserInfo>();
        responseData.LIZLLL = new HashMap<Long, BattleComboInfo>();
        responseData.LIZ = new HashMap<Long, BattleResult>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                0Ta.LIZ(liz);
                return responseData;
            }
            final Long n = null;
            final Long n2 = null;
            final Long n3 = null;
            Long value = null;
            if (liziz != 1) {
                if (liziz != 3) {
                    if (liziz != 4) {
                        if (liziz != 5) {
                            0Tb.LIZJ(0Ta);
                        }
                        else {
                            final long liz2 = 0Ta.LIZ();
                            BattleComboInfo liz3 = null;
                            while (true) {
                                final int liziz2 = 0Ta.LIZIZ();
                                if (liziz2 == -1) {
                                    break;
                                }
                                if (liziz2 != 1) {
                                    if (liziz2 != 2) {
                                        continue;
                                    }
                                    liz3 = _BattleComboInfo_ProtoDecoder.LIZ(0Ta);
                                }
                                else {
                                    value = 0Tb.LIZIZ(0Ta);
                                }
                            }
                            0Ta.LIZ(liz2);
                            if (value == null) {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                            if (liz3 == null) {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                            responseData.LIZLLL.put(value, liz3);
                        }
                    }
                    else {
                        final long liz4 = 0Ta.LIZ();
                        BattleUserInfo liz5 = null;
                        Long value2 = n;
                        while (true) {
                            final int liziz3 = 0Ta.LIZIZ();
                            if (liziz3 == -1) {
                                break;
                            }
                            if (liziz3 != 1) {
                                if (liziz3 != 2) {
                                    continue;
                                }
                                liz5 = _BattleUserInfo_ProtoDecoder.LIZ(0Ta);
                            }
                            else {
                                value2 = 0Tb.LIZIZ(0Ta);
                            }
                        }
                        0Ta.LIZ(liz4);
                        if (value2 == null) {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                        if (liz5 == null) {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                        responseData.LIZJ.put(value2, liz5);
                    }
                }
                else {
                    final long liz6 = 0Ta.LIZ();
                    BattleUserArmies liz7 = null;
                    Long value3 = n2;
                    while (true) {
                        final int liziz4 = 0Ta.LIZIZ();
                        if (liziz4 == -1) {
                            break;
                        }
                        if (liziz4 != 1) {
                            if (liziz4 != 2) {
                                continue;
                            }
                            liz7 = _BattleUserArmies_ProtoDecoder.LIZ(0Ta);
                        }
                        else {
                            value3 = 0Tb.LIZIZ(0Ta);
                        }
                    }
                    0Ta.LIZ(liz6);
                    if (value3 == null) {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                    if (liz7 == null) {
                        throw new IllegalStateException("Map value must not be null!");
                    }
                    responseData.LIZIZ.put(value3, liz7);
                }
            }
            else {
                final long liz8 = 0Ta.LIZ();
                BattleResult liz9 = null;
                Long value4 = n3;
                while (true) {
                    final int liziz5 = 0Ta.LIZIZ();
                    if (liziz5 == -1) {
                        break;
                    }
                    if (liziz5 != 1) {
                        if (liziz5 != 2) {
                            continue;
                        }
                        liz9 = _BattleResult_ProtoDecoder.LIZ(0Ta);
                    }
                    else {
                        value4 = 0Tb.LIZIZ(0Ta);
                    }
                }
                0Ta.LIZ(liz8);
                if (value4 == null) {
                    throw new IllegalStateException("Map key must not be null!");
                }
                if (liz9 == null) {
                    throw new IllegalStateException("Map value must not be null!");
                }
                responseData.LIZ.put(value4, liz9);
            }
        }
    }
}
