// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.reddit.domain.model.vote.VoteDirection;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/Votable;", "", "domain", "", "getDomain", "()Ljava/lang/String;", "instanceId", "getInstanceId", "isScoreHidden", "", "()Z", "name", "getName", "score", "", "getScore", "()I", "votableType", "getVotableType", "voteDirection", "Lcom/reddit/domain/model/vote/VoteDirection;", "getVoteDirection", "()Lcom/reddit/domain/model/vote/VoteDirection;", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface Votable
{
    public static final Companion Companion = Votable.Companion.$$INSTANCE;
    public static final int VOTE_DIRECTION_DOWN = -1;
    public static final int VOTE_DIRECTION_NONE = 0;
    public static final int VOTE_DIRECTION_UP = 1;
    
    String getDomain();
    
    String getInstanceId();
    
    String getName();
    
    int getScore();
    
    String getVotableType();
    
    VoteDirection getVoteDirection();
    
    boolean isScoreHidden();
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/Votable$Companion;", "", "()V", "VOTE_DIRECTION_DOWN", "", "VOTE_DIRECTION_NONE", "VOTE_DIRECTION_UP", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        public static final /* synthetic */ Companion $$INSTANCE;
        public static final int VOTE_DIRECTION_DOWN = -1;
        public static final int VOTE_DIRECTION_NONE = 0;
        public static final int VOTE_DIRECTION_UP = 1;
        
        static {
            $$INSTANCE = new Companion();
        }
        
        private Companion() {
        }
    }
}
