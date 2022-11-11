// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.language;

import java.util.List;
import com.reddit.domain.model.Result;
import lg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/modtools/language/LanguageRepository;", "", "Lcom/reddit/domain/model/Result;", "", "Lcom/reddit/domain/modtools/language/Language;", "getActiveLanguages", "(Llg2/c;)Ljava/lang/Object;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface LanguageRepository
{
    Object getActiveLanguages(final c<? super Result<? extends List<Language>>> p0);
}
