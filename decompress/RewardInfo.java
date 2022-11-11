// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class RewardInfo
{
    public static final a<RewardInfo, RewardInfo.RewardInfo$Builder> ADAPTER;
    public final Integer amount;
    public final String type;
    
    static {
        ADAPTER = (a)new RewardInfo.RewardInfo$RewardInfoAdapter((RewardInfo$1)null);
    }
    
    private RewardInfo(final RewardInfo.RewardInfo$Builder rewardInfo$Builder) {
        this.type = RewardInfo.RewardInfo$Builder.access$100(rewardInfo$Builder);
        this.amount = RewardInfo.RewardInfo$Builder.access$200(rewardInfo$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof RewardInfo)) {
            return false;
        }
        final RewardInfo rewardInfo = (RewardInfo)o;
        final String type = this.type;
        final String type2 = rewardInfo.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Integer amount = this.amount;
            final Integer amount2 = rewardInfo.amount;
            boolean b2 = b;
            if (amount == amount2) {
                return b2;
            }
            if (amount != null && amount.equals(amount2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Integer amount = this.amount;
        if (amount != null) {
            hashCode = amount.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RewardInfo{type=");
        k.append(this.type);
        k.append(", amount=");
        k.append(this.amount);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        RewardInfo.ADAPTER.write(e, (Object)this);
    }
}
