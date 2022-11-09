// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import com.reddit.data.modtools.remote.model.MarkdownConvertedResponse;
import av2.o;
import av2.e;
import com.reddit.domain.model.ConverterRichTextResponse;
import av2.t;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/modtools/remote/RemoteMarkdownConverterDataSource;", "", "", "richtextJson", "outputMode", "", "rawJson", "", "allowNestedMedia", "Lcom/reddit/data/modtools/remote/model/MarkdownConvertedResponse;", "convertRichTextToMarkdown", "(Ljava/lang/String;Ljava/lang/String;IZLtg2/c;)Ljava/lang/Object;", "markdownText", "Lcom/reddit/domain/model/ConverterRichTextResponse;", "convertMarkdownToRichText", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMarkdownConverterDataSource
{
    @e
    @o("api/convert_rte_body_format")
    Object convertMarkdownToRichText(@c("markdown_text") final String p0, @c("output_mode") final String p1, @t("raw_json") final int p2, @t("allow_nested_media") final boolean p3, final tg2.c<? super ConverterRichTextResponse> p4);
    
    @e
    @o("api/convert_rte_body_format")
    Object convertRichTextToMarkdown(@c("richtext_json") final String p0, @c("output_mode") final String p1, @t("raw_json") final int p2, @t("allow_nested_media") final boolean p3, final tg2.c<? super MarkdownConvertedResponse> p4);
}
