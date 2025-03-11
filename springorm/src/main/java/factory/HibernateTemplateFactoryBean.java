package factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.hibernate.SessionFactory;

public class HibernateTemplateFactoryBean implements FactoryBean<HibernateTemplate> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public HibernateTemplate getObject() throws Exception {
        // Create the HibernateTemplate using the constructor that takes a SessionFactory.
        return new HibernateTemplate(sessionFactory);
    }

    @Override
    public Class<?> getObjectType() {
        return HibernateTemplate.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
