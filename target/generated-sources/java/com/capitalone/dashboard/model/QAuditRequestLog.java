package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuditRequestLog is a Querydsl query type for AuditRequestLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditRequestLog extends EntityPathBase<AuditRequestLog> {

    private static final long serialVersionUID = -844317618L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuditRequestLog auditRequestLog = new QAuditRequestLog("auditRequestLog");

    public final QBaseModel _super;

    public final StringPath apiUser = createString("apiUser");

    public final StringPath client = createString("client");

    //inherited
    public final StringPath clientReference;

    public final StringPath endpoint = createString("endpoint");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath method = createString("method");

    public final SimplePath<Object> parameter = createSimple("parameter", Object.class);

    public final SimplePath<Object> requestBody = createSimple("requestBody", Object.class);

    public final StringPath requestContentType = createString("requestContentType");

    public final NumberPath<Long> requestSize = createNumber("requestSize", Long.class);

    public final SimplePath<Object> responseBody = createSimple("responseBody", Object.class);

    public final NumberPath<Integer> responseCode = createNumber("responseCode", Integer.class);

    public final StringPath responseContentType = createString("responseContentType");

    public final NumberPath<Long> responseSize = createNumber("responseSize", Long.class);

    public final NumberPath<Long> responseTime = createNumber("responseTime", Long.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QAuditRequestLog(String variable) {
        this(AuditRequestLog.class, forVariable(variable), INITS);
    }

    public QAuditRequestLog(Path<? extends AuditRequestLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuditRequestLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuditRequestLog(PathMetadata metadata, PathInits inits) {
        this(AuditRequestLog.class, metadata, inits);
    }

    public QAuditRequestLog(Class<? extends AuditRequestLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

