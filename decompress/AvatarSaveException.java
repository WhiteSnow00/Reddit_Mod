// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.util;

import ah2.f;
import com.reddit.domain.snoovatar.repository.SnoovatarRepository$SaveResult;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/snoovatar/repository/util/AvatarSaveException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "saveErrorResult", "Lcom/reddit/domain/snoovatar/repository/SnoovatarRepository$SaveResult;", "(Lcom/reddit/domain/snoovatar/repository/SnoovatarRepository$SaveResult;)V", "getSaveErrorResult", "()Lcom/reddit/domain/snoovatar/repository/SnoovatarRepository$SaveResult;", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AvatarSaveException extends Exception
{
    private final SnoovatarRepository$SaveResult saveErrorResult;
    
    public AvatarSaveException(final SnoovatarRepository$SaveResult saveErrorResult) {
        f.f((Object)saveErrorResult, "saveErrorResult");
        this.saveErrorResult = saveErrorResult;
    }
    
    public final SnoovatarRepository$SaveResult getSaveErrorResult() {
        return this.saveErrorResult;
    }
}
