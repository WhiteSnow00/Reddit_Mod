// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/Reportable;", "", "approvedBy", "", "getApprovedBy", "()Ljava/lang/String;", "ignoreReports", "", "getIgnoreReports", "()Z", "modReports", "", "getModReports", "()Ljava/util/List;", "numReports", "", "getNumReports", "()I", "userReports", "getUserReports", "verdictAt", "", "getVerdictAt", "()Ljava/lang/Long;", "verdictByDisplayName", "getVerdictByDisplayName", "verdictByKindWithId", "getVerdictByKindWithId", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface Reportable
{
    String getApprovedBy();
    
    boolean getIgnoreReports();
    
    List<List<String>> getModReports();
    
    int getNumReports();
    
    List<List<String>> getUserReports();
    
    Long getVerdictAt();
    
    String getVerdictByDisplayName();
    
    String getVerdictByKindWithId();
}
