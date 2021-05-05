package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuditResult is a Querydsl query type for AuditResult
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuditResult extends EntityPathBase<AuditResult> {

    private static final long serialVersionUID = -115114314L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuditResult auditResult = new QAuditResult("auditResult");

    public final QBaseModel _super;

    public final StringPath auditDetails = createString("auditDetails");

    public final StringPath auditStatus = createString("auditStatus");

    public final EnumPath<AuditType> auditType = createEnum("auditType", AuditType.class);

    public final StringPath auditTypeStatus = createString("auditTypeStatus");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath configItemBusAppName = createString("configItemBusAppName");

    public final StringPath configItemBusAppOwner = createString("configItemBusAppOwner");

    public final StringPath configItemBusServName = createString("configItemBusServName");

    public final StringPath configItemBusServOwner = createString("configItemBusServOwner");

    public final org.bson.types.QObjectId dashboardId;

    public final StringPath dashboardTitle = createString("dashboardTitle");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath lineOfBusiness = createString("lineOfBusiness");

    public final MapPath<String, Object, SimplePath<Object>> options = this.<String, Object, SimplePath<Object>>createMap("options", String.class, Object.class, SimplePath.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final MapPath<Object, Object, SimplePath<Object>> traceability = this.<Object, Object, SimplePath<Object>>createMap("traceability", Object.class, Object.class, SimplePath.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public QAuditResult(String variable) {
        this(AuditResult.class, forVariable(variable), INITS);
    }

    public QAuditResult(Path<? extends AuditResult> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuditResult(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuditResult(PathMetadata metadata, PathInits inits) {
        this(AuditResult.class, metadata, inits);
    }

    public QAuditResult(Class<? extends AuditResult> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.dashboardId = inits.isInitialized("dashboardId") ? new org.bson.types.QObjectId(forProperty("dashboardId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

