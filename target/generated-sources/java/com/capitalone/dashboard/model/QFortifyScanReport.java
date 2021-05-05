package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFortifyScanReport is a Querydsl query type for FortifyScanReport
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFortifyScanReport extends EntityPathBase<FortifyScanReport> {

    private static final long serialVersionUID = 199709600L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFortifyScanReport fortifyScanReport = new QFortifyScanReport("fortifyScanReport");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath name = createString("name");

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final MapPath<String, FortifyScanReport.Threat, QFortifyScanReport_Threat> threats = this.<String, FortifyScanReport.Threat, QFortifyScanReport_Threat>createMap("threats", String.class, FortifyScanReport.Threat.class, QFortifyScanReport_Threat.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public final StringPath version = createString("version");

    public QFortifyScanReport(String variable) {
        this(FortifyScanReport.class, forVariable(variable), INITS);
    }

    public QFortifyScanReport(Path<? extends FortifyScanReport> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFortifyScanReport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFortifyScanReport(PathMetadata metadata, PathInits inits) {
        this(FortifyScanReport.class, metadata, inits);
    }

    public QFortifyScanReport(Class<? extends FortifyScanReport> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

