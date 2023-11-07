
import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"LProgressRequestBody;", "Lokhttp3/RequestBody;", "mFile", "Ljava/io/File;", "(Ljava/io/File;)V", "ignoreFirstNumberOfWriteToCalls", "", "(Ljava/io/File;I)V", "getProgressSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getGetProgressSubject", "()Lio/reactivex/subjects/PublishSubject;", "getIgnoreFirstNumberOfWriteToCalls", "()I", "getMFile", "()Ljava/io/File;", "numWriteToCalls", "getNumWriteToCalls", "setNumWriteToCalls", "(I)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "Lio/reactivex/Observable;", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "app_debug"})
public final class ProgressRequestBody extends okhttp3.RequestBody {
    @org.jetbrains.annotations.NotNull
    private final java.io.File mFile = null;
    private final int ignoreFirstNumberOfWriteToCalls = 0;
    private int numWriteToCalls = 0;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.PublishSubject<java.lang.Float> getProgressSubject = null;
    @org.jetbrains.annotations.NotNull
    public static final ProgressRequestBody.Companion Companion = null;
    private static final int DEFAULT_BUFFER_SIZE = 2048;
    
    @org.jetbrains.annotations.NotNull
    public final java.io.File getMFile() {
        return null;
    }
    
    public final int getIgnoreFirstNumberOfWriteToCalls() {
        return 0;
    }
    
    public ProgressRequestBody(@org.jetbrains.annotations.NotNull
    java.io.File mFile) {
        super();
    }
    
    public ProgressRequestBody(@org.jetbrains.annotations.NotNull
    java.io.File mFile, int ignoreFirstNumberOfWriteToCalls) {
        super();
    }
    
    public final int getNumWriteToCalls() {
        return 0;
    }
    
    public final void setNumWriteToCalls(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.subjects.PublishSubject<java.lang.Float> getGetProgressSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.Float> getProgressSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override
    public void writeTo(@org.jetbrains.annotations.NotNull
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"LProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}