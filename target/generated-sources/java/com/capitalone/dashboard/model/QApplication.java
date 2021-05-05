package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApplication is a Querydsl query type for Application
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QApplication extends BeanPath<Application> {

    private static final long serialVersionUID = 896713774L;

    public static final QApplication application = new QApplication("application");

    public final ListPath<Component, QComponent> components = this.<Component, QComponent>createList("components", Component.class, QComponent.class, PathInits.DIRECT2);

    public final StringPath lineOfBusiness = createString("lineOfBusiness");

    public final StringPath name = createString("name");

    public final StringPath owner = createString("owner");

    public QApplication(String variable) {
        super(Application.class, forVariable(variable));
    }

    public QApplication(Path<? extends Application> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApplication(PathMetadata metadata) {
        super(Application.class, metadata);
    }

}

