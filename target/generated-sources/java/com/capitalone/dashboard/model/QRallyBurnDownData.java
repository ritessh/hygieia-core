package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRallyBurnDownData is a Querydsl query type for RallyBurnDownData
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRallyBurnDownData extends EntityPathBase<RallyBurnDownData> {

    private static final long serialVersionUID = 2000336451L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRallyBurnDownData rallyBurnDownData = new QRallyBurnDownData("rallyBurnDownData");

    public final QBaseModel _super;

    public final ListPath<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>> burnDownData = this.<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>>createList("burnDownData", java.util.Map.class, SimplePath.class, PathInits.DIRECT2);

    //inherited
    public final StringPath clientReference;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath iterationId = createString("iterationId");

    public final StringPath iterationName = createString("iterationName");

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final StringPath projectId = createString("projectId");

    public final StringPath projectName = createString("projectName");

    public final NumberPath<Double> totalEstimate = createNumber("totalEstimate", Double.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QRallyBurnDownData(String variable) {
        this(RallyBurnDownData.class, forVariable(variable), INITS);
    }

    public QRallyBurnDownData(Path<? extends RallyBurnDownData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRallyBurnDownData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRallyBurnDownData(PathMetadata metadata, PathInits inits) {
        this(RallyBurnDownData.class, metadata, inits);
    }

    public QRallyBurnDownData(Class<? extends RallyBurnDownData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

