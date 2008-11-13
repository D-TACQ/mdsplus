#ifndef EVENTHANDLER_H_
#define EVENTHANDLER_H_

#include "SharedMemManager.h"
#include "Notifier.h"
#include "RelativePointer.h"
#include "Timeout.h"

//Class EventHandler manages the occurrence of a given event. 
//Events can be associated with either an ID integer or a char string.


class EventHandler
{
	RelativePointer name;
	RelativePointer notifierHead;
	Lock lock;
	RelativePointer nxt;
	RelativePointer dataBuffer;
	int dataSize;
	bool catchAll;
	bool synch;
	
public:
	void setNext(EventHandler *next)
	{
		nxt = next;
	}
	EventHandler *getNext()
	{
		return (EventHandler *)nxt.getAbsAddress();
	}
	bool isSynch() {return synch;}
	void setData(void *buf, int size, SharedMemManager *memManager);
	void *getDataBuffer()
	{
		return dataBuffer.getAbsAddress();
	}
	int getDataSize()
	{
		return dataSize;
	}
	void setName(char *name, SharedMemManager *memManager);
	char *getName() 
	{
		return (char *)name.getAbsAddress();
	}
	bool isCatchAll() {return catchAll;}
	void initialize(char *name, SharedMemManager *memManager);
	void initialize();
	void *addListener(Thread *thread, Runnable *runnable, void *arg, SharedMemManager *memManager);
	//RemoveListener removes the corresponding Notifier from the notifier chain if found
	//The passed address is valid only in the same address space of the process which
	//created the Notifier instance
	void removeListener(void *notifierAddr, SharedMemManager *memManager);
	void trigger();
	void watchdogTrigger();
	void triggerAndWait();
	bool triggerAndWait(Timeout &);
	bool corresponds(char *name);
	void clean(SharedMemManager *memManager);
};


#endif /*EVENTHANDLER_H_*/
