package com.dayvar.template.pattern;

public abstract class AbstractTask {
   private RequiredTask requiredTask;

   public AbstractTask() {
      this.requiredTask = new RequiredTask();
   }


   public AbstractTask(RequiredTask requiredTask) {
      this.requiredTask = requiredTask;
   }

   public void execute(){
      requiredTask.execute();
      doExecute();
   }

   protected abstract void doExecute();
}
