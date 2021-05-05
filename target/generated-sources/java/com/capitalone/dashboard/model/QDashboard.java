package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDashboard is a Querydsl query type for Dashboard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDashboard extends EntityPathBase<Dashboard> {

    private static final long serialVersionUID = -1978152718L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDashboard dashboard = new QDashboard("dashboard");

    public final QBaseModel _super;

    public final ListPath<String, StringPath> activeWidgets = this.<String, StringPath>createList("activeWidgets", String.class, StringPath.class, PathInits.DIRECT2);

    public final QApplication application;

    //inherited
    public final StringPath clientReference;

    public final StringPath configurationItemBusAppName = createString("configurationItemBusAppName");

    public final StringPath configurationItemBusServName = createString("configurationItemBusServName");

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final NumberPath<Integer> errorCode = createNumber("errorCode", Integer.class);

    public final StringPath errorMessage = createString("errorMessage");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath owner = createString("owner");

    public final ListPath<Owner, QOwner> owners = this.<Owner, QOwner>createList("owners", Owner.class, QOwner.class, PathInits.DIRECT2);

    public final MapPath<String, String, StringPath> properties = this.<String, String, StringPath>createMap("properties", String.class, String.class, StringPath.class);

    public final BooleanPath remoteCreated = createBoolean("remoteCreated");

    public final EnumPath<ScoreDisplayType> scoreDisplay = createEnum("scoreDisplay", ScoreDisplayType.class);

    public final BooleanPath scoreEnabled = createBoolean("scoreEnabled");

    public final StringPath template = createString("template");

    public final StringPath title = createString("title");

    public final EnumPath<DashboardType> type = createEnum("type", DashboardType.class);

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final BooleanPath validAppName = createBoolean("validAppName");

    public final BooleanPath validServiceName = createBoolean("validServiceName");

    public final ListPath<Widget, QWidget> widgets = this.<Widget, QWidget>createList("widgets", Widget.class, QWidget.class, PathInits.DIRECT2);

    public QDashboard(String variable) {
        this(Dashboard.class, forVariable(variable), INITS);
    }

    public QDashboard(Path<? extends Dashboard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDashboard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDashboard(PathMetadata metadata, PathInits inits) {
        this(Dashboard.class, metadata, inits);
    }

    public QDashboard(Class<? extends Dashboard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.application = inits.isInitialized("application") ? new QApplication(forProperty("application")) : null;
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

