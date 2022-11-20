// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.db.dao;

import java.util.List;
import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.data.db.dao.ClaimablePointsDao$DefaultImpls", f = "ClaimablePointsDao.kt", l = { 75, 76 }, m = "clearStaleAndInsertNew")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class ClaimablePointsDao$clearStaleAndInsertNew$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    
    public ClaimablePointsDao$clearStaleAndInsertNew$1(final gg2.c<? super ClaimablePointsDao$clearStaleAndInsertNew$1> c) {
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return a$a.a((b)null, (String)null, (List)null, (gg2.c)this);
    }
}
