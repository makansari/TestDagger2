package com.ansari.testdagger2.second;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {SharedPredModule.class})

public interface MyComponent {

    void inject(Main2Activity main2Activity);
}
