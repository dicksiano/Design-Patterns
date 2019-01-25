interface State  { 
    public void f(Context ctx); 
} 
  
class Context { 
    private State _currentState; 
  
    public Context()    { 
        _currentState = new StateA(); 
    } 
  
    public void setState(State state) { 
        _currentState = state; 
    } 
  
    public void f() { 
        _currentState.f(this); 
    } 
} 
  
class StateA implements State { 
    @Override
    public void f(Context ctx)  { 
    } 
} 
  
class StateB implements State { 
    @Override
    public void f(Context ctx)  { 
    } 
} 
